package uts.codesale.commons;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by IntelliJ IDEA. User: fraispy Date: 2007-4-2 Time: 14:27:45
 * 
 * This class serves as the Base class for all other DAOs - namely to hold
 * common CRUD methods that they might all use. You should only need to extend
 * this class when your require custom CRUD logic.
 * 
 * <p>
 * To register this class in your Spring context file, use the following XML.
 * 
 * <pre>
 *      &lt;bean id=&quot;fooDao&quot; class=&quot;org.appfuse.dao.hibernate.GenericDaoHibernate&quot;&gt;
 *          &lt;constructor-arg value=&quot;org.appfuse.model.Foo&quot;/&gt;
 *          &lt;property name=&quot;sessionFactory&quot; ref=&quot;sessionFactory&quot;/&gt;
 *      &lt;/bean&gt;
 * </pre>
 * 
 * @author <a href="mailto:bwnoll@gmail.com">Bryan Noll</a>
 */
public class GenericDaoImpl<T, PK extends Serializable> extends
		HibernateDaoSupport implements IGenericDao<T, PK> {
	protected final Log log = LogFactory.getLog(getClass());

	private Class<T> persistentClass;

	public GenericDaoImpl(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	public List<T> getAll() {
		return super.getHibernateTemplate().loadAll(this.persistentClass);
	}

	public T get(PK id) {
		T entity = (T) super.getHibernateTemplate().get(this.persistentClass,
				id);

		if (entity == null) {
			log.warn("Uh oh, '" + this.persistentClass + "' object with id '"
					+ id + "' not found...");
			throw new ObjectRetrievalFailureException(this.persistentClass, id);
		}

		return entity;
	}

	public boolean exists(PK id) {
		T entity = (T) super.getHibernateTemplate().get(this.persistentClass,
				id);
		if (entity == null) {
			return false;
		} else {
			return true;
		}
	}

	public void save(T object) {
		super.getHibernateTemplate().saveOrUpdate(object);
	}

	public void remove(PK id) {
		super.getHibernateTemplate().delete(this.get(id));
	}
}
