




<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>jQuery-Tags-Input/jquery.tagsinput.js at master · xoxco/jQuery-Tags-Input · GitHub</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="xoxco/jQuery-Tags-Input" name="twitter:title" /><meta content="jQuery-Tags-Input - Magically convert a simple text input into a cool tag list with this jQuery plugin." name="twitter:description" /><meta content="https://avatars.githubusercontent.com/u/725866" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars.githubusercontent.com/u/725866" property="og:image" /><meta content="xoxco/jQuery-Tags-Input" property="og:title" /><meta content="https://github.com/xoxco/jQuery-Tags-Input" property="og:url" /><meta content="jQuery-Tags-Input - Magically convert a simple text input into a cool tag list with this jQuery plugin." property="og:description" />

    <meta name="hostname" content="github-fe138-cp1-prd.iad.github.net">
    <meta name="ruby" content="ruby 2.1.0p0-github-tcmalloc (87c9373a41) [x86_64-linux]">
    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />


    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="7D075641:2C80:354772:53157198" name="octolytics-dimension-request_id" />
    

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="TQ/bq885EHOdBWeP1THwyZn6cZ9SKg18V9lnd9TFiy8=" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-adb8493796a61d936498dd1a4b4e778c3423de88.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-bfa22a8c0adc03f440ef78f2e837a2bbdd81e521.css" media="all" rel="stylesheet" type="text/css" />
    
    


      <script crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/frameworks-75c3712476c7af863873362d0cdf06a94a4b4fa3.js" type="text/javascript"></script>
      <script async="async" crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/github-bfb809c1eec00a59d19ebf7b3ef79e3ef2ac724f.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="1fa2d1697f0b25c4b6ae5cbab42c0ccf">

        <link data-pjax-transient rel='permalink' href='/xoxco/jQuery-Tags-Input/blob/1221c0b280a79614bf4ac6855bc32916b4d349ce/jquery.tagsinput.js'>

  <meta name="description" content="jQuery-Tags-Input - Magically convert a simple text input into a cool tag list with this jQuery plugin." />

  <meta content="725866" name="octolytics-dimension-user_id" /><meta content="xoxco" name="octolytics-dimension-user_login" /><meta content="1606665" name="octolytics-dimension-repository_id" /><meta content="xoxco/jQuery-Tags-Input" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="1606665" name="octolytics-dimension-repository_network_root_id" /><meta content="xoxco/jQuery-Tags-Input" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/xoxco/jQuery-Tags-Input/commits/master.atom" rel="alternate" title="Recent Commits to jQuery-Tags-Input:master" type="application/atom+xml" />

  </head>


  <body class="logged_out  env-production macintosh vis-public page-blob tipsy-tooltips">
    <div class="wrapper">
      
      
      
      


      
      <div class="header header-logged-out">
  <div class="container clearfix">

    <a class="header-logo-wordmark" href="https://github.com/">
      <span class="mega-octicon octicon-logo-github"></span>
    </a>

    <div class="header-actions">
        <a class="button primary" href="/join">Sign up</a>
      <a class="button signin" href="/login?return_to=%2Fxoxco%2FjQuery-Tags-Input%2Fblob%2Fmaster%2Fjquery.tagsinput.js">Sign in</a>
    </div>

    <div class="command-bar js-command-bar  in-repository">

      <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
        <li class="features"><a href="/features">Features</a></li>
          <li class="enterprise"><a href="https://enterprise.github.com/">Enterprise</a></li>
          <li class="blog"><a href="/blog">Blog</a></li>
      </ul>
        <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<input type="text" data-hotkey="/ s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    
      data-repo="xoxco/jQuery-Tags-Input"
      data-branch="master"
      data-sha="e5a21bf1d0ac1c06baf8cfc2326c94f649f2466d"
  >

    <input type="hidden" name="nwo" value="xoxco/jQuery-Tags-Input" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target" role="button" aria-haspopup="true">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container" aria-hidden="true">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="help tooltipped tooltipped-s" aria-label="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
    </div>

  </div>
</div>




          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">


  <li>
    <a href="/login?return_to=%2Fxoxco%2FjQuery-Tags-Input"
    class="minibutton with-count js-toggler-target star-button tooltipped tooltipped-n"
    aria-label="You must be signed in to use this feature" rel="nofollow">
    <span class="octicon octicon-star"></span>Star
  </a>

    <a class="social-count js-social-count" href="/xoxco/jQuery-Tags-Input/stargazers">
      1,073
    </a>

  </li>

    <li>
      <a href="/login?return_to=%2Fxoxco%2FjQuery-Tags-Input"
        class="minibutton with-count js-toggler-target fork-button tooltipped tooltipped-n"
        aria-label="You must be signed in to fork a repository" rel="nofollow">
        <span class="octicon octicon-git-branch"></span>Fork
      </a>
      <a href="/xoxco/jQuery-Tags-Input/network" class="social-count">
        402
      </a>
    </li>
</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo"></span>
          <span class="author">
            <a href="/xoxco" class="url fn" itemprop="url" rel="author"><span itemprop="title">xoxco</span></a>
          </span>
          <span class="repohead-name-divider">/</span>
          <strong><a href="/xoxco/jQuery-Tags-Input" class="js-current-repository js-repo-home-link">jQuery-Tags-Input</a></strong>

          <span class="page-context-loader">
            <img alt="Octocat-spinner-32" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline js-new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/xoxco/jQuery-Tags-Input" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-gotokey="c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /xoxco/jQuery-Tags-Input">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

        <li class="tooltipped tooltipped-w" aria-label="Issues">
          <a href="/xoxco/jQuery-Tags-Input/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="i" data-selected-links="repo_issues /xoxco/jQuery-Tags-Input/issues">
            <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
            <span class='counter'>116</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>

      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/xoxco/jQuery-Tags-Input/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="p" data-selected-links="repo_pulls /xoxco/jQuery-Tags-Input/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>46</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped tooltipped-w" aria-label="Wiki">
          <a href="/xoxco/jQuery-Tags-Input/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_wiki /xoxco/jQuery-Tags-Input/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/xoxco/jQuery-Tags-Input/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /xoxco/jQuery-Tags-Input/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/xoxco/jQuery-Tags-Input/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /xoxco/jQuery-Tags-Input/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Network">
        <a href="/xoxco/jQuery-Tags-Input/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /xoxco/jQuery-Tags-Input/network">
          <span class="octicon octicon-git-branch"></span> <span class="full-word">Network</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


  </div>
</div>

              <div class="only-with-full-nav">
                

  

<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/xoxco/jQuery-Tags-Input.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/xoxco/jQuery-Tags-Input.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/xoxco/jQuery-Tags-Input" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/xoxco/jQuery-Tags-Input" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <span class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <a href="https://help.github.com/articles/which-remote-url-should-i-use">
    <span class="octicon octicon-question"></span>
    </a>
  </span>
</p>

  <a href="http://mac.github.com" data-url="github-mac://openRepo/https://github.com/xoxco/jQuery-Tags-Input" class="minibutton sidebar-button js-conduit-rewrite-url">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>


                <a href="/xoxco/jQuery-Tags-Input/archive/master.zip"
                   class="minibutton sidebar-button"
                   title="Download this repository as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:18c80d2215f4da50fa7bf74bb5f8d812 -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<a href="/xoxco/jQuery-Tags-Input/find/master" data-pjax data-hotkey="t" class="js-show-file-finder" style="display:none">Show File Finder</a>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-remove-close js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/xoxco/jQuery-Tags-Input/blob/gh-pages/jquery.tagsinput.js"
                 data-name="gh-pages"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="gh-pages">gh-pages</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/xoxco/jQuery-Tags-Input/blob/master/jquery.tagsinput.js"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/xoxco/jQuery-Tags-Input/blob/rewrite/jquery.tagsinput.js"
                 data-name="rewrite"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="rewrite">rewrite</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/xoxco/jQuery-Tags-Input/tree/v1.3.2/jquery.tagsinput.js"
                 data-name="v1.3.2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v1.3.2">v1.3.2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/xoxco/jQuery-Tags-Input/tree/v1.3.1/jquery.tagsinput.js"
                 data-name="v1.3.1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v1.3.1">v1.3.1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/xoxco/jQuery-Tags-Input/tree/v1.3/jquery.tagsinput.js"
                 data-name="v1.3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v1.3">v1.3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/xoxco/jQuery-Tags-Input/tree/v1.2.5/jquery.tagsinput.js"
                 data-name="v1.2.5"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v1.2.5">v1.2.5</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/xoxco/jQuery-Tags-Input/tree/v1.2.4/jquery.tagsinput.js"
                 data-name="v1.2.4"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v1.2.4">v1.2.4</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/xoxco/jQuery-Tags-Input/tree/v1.2.3/jquery.tagsinput.js"
                 data-name="v1.2.3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v1.2.3">v1.2.3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/xoxco/jQuery-Tags-Input/tree/v1.2.2/jquery.tagsinput.js"
                 data-name="v1.2.2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v1.2.2">v1.2.2</a>
            </div> <!-- /.select-menu-item -->
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/xoxco/jQuery-Tags-Input" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">jQuery-Tags-Input</span></a></span></span><span class="separator"> / </span><strong class="final-path">jquery.tagsinput.js</strong> <span aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="jquery.tagsinput.js" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


  <div class="commit file-history-tease">
    <img alt="Ben Brown" class="main-avatar js-avatar" data-user="729873" height="24" src="https://0.gravatar.com/avatar/e8ea053f7813c4e2ea7614ab957476ac?d=https%3A%2F%2Fidenticons.github.com%2Fa75fe035d677f8c542feee2d1221644b.png&amp;r=x&amp;s=140" width="24" />
    <span class="author"><a href="/benbrown" rel="author">benbrown</a></span>
    <time class="js-relative-date" data-title-format="YYYY-MM-DD HH:mm:ss" datetime="2012-04-11T13:44:40-07:00" title="2012-04-11 13:44:40">April 11, 2012</time>
    <div class="commit-title">
        <a href="/xoxco/jQuery-Tags-Input/commit/bc50b025fb1124c71cd1119f2d649e398c7dcdf2" class="message" data-pjax="true" title="Merge pull request #37 from devbrothers/master

Multiple tags-input instances fix">Merge pull request</a> <a href="https://github.com/xoxco/jQuery-Tags-Input/pull/37" class="issue-link" title="Multiple tags-input instances fix">#37</a> <a href="/xoxco/jQuery-Tags-Input/commit/bc50b025fb1124c71cd1119f2d649e398c7dcdf2" class="message" data-pjax="true" title="Merge pull request #37 from devbrothers/master

Multiple tags-input instances fix">from devbrothers/master</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>14</strong> contributors</a></p>
          <a class="avatar tooltipped tooltipped-s" aria-label="benbrown" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=benbrown"><img alt="Ben Brown" class=" js-avatar" data-user="729873" height="20" src="https://0.gravatar.com/avatar/e8ea053f7813c4e2ea7614ab957476ac?d=https%3A%2F%2Fidenticons.github.com%2Fa75fe035d677f8c542feee2d1221644b.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="sebm" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=sebm"><img alt="Sebastian Motraghi" class=" js-avatar" data-user="188161" height="20" src="https://0.gravatar.com/avatar/2533b34dceec1e38ab4d6eed2606c878?d=https%3A%2F%2Fidenticons.github.com%2F1bbd0f2b931ea8a6fca19e8cb29f3936.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="marioestrada" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=marioestrada"><img alt="Mario Estrada" class=" js-avatar" data-user="47727" height="20" src="https://2.gravatar.com/avatar/fbf5625265bca97681fe411525e5fd2e?d=https%3A%2F%2Fidenticons.github.com%2F7a2af65d5b4d03e85908eaddc6fbdad9.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="devbrothers" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=devbrothers"><img alt="melkorm" class=" js-avatar" data-user="619996" height="20" src="https://0.gravatar.com/avatar/5200d321cadcb78efe0cff62faa69a1c?d=https%3A%2F%2Fidenticons.github.com%2Fd289d8f42874f7f7f8ccd9b13f5d79ab.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="erlend" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=erlend"><img alt="Erlend Finvåg" class=" js-avatar" data-user="4634" height="20" src="https://2.gravatar.com/avatar/d5167c28cf6ac6fb84dbeced4d9b1ba1?d=https%3A%2F%2Fidenticons.github.com%2F18fc72d8b8aba03a4d84f66efabce82e.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="javiertoledo" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=javiertoledo"><img alt="Javier Toledo" class=" js-avatar" data-user="175096" height="20" src="https://0.gravatar.com/avatar/d2224d4b9a33268223621ca9a5e3b369?d=https%3A%2F%2Fidenticons.github.com%2Fab4cd3bbcc149c5bbcacea137fb87e86.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="jaylevitt" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=jaylevitt"><img alt="Jay Levitt" class=" js-avatar" data-user="11246" height="20" src="https://2.gravatar.com/avatar/b8aca816cb8646a855175f64bdfa2838?d=https%3A%2F%2Fidenticons.github.com%2Fc99e757a469e0631c1a61e97949885f1.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="therabidbanana" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=therabidbanana"><img alt="David Haslem" class=" js-avatar" data-user="18348" height="20" src="https://0.gravatar.com/avatar/713d855987c52e0f414df57217427f54?d=https%3A%2F%2Fidenticons.github.com%2Fce6907d94233d611e2f8349ab3b38264.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="Maxooo" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=Maxooo"><img alt="Maxime Corson" class=" js-avatar" data-user="1563876" height="20" src="https://0.gravatar.com/avatar/95628a22a5c2244dd2bc67129930ab81?d=https%3A%2F%2Fidenticons.github.com%2F5c43e714558e266e24596dcd760e7f9a.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="prymitive" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=prymitive"><img alt="Łukasz Mierzwa" class=" js-avatar" data-user="114288" height="20" src="https://1.gravatar.com/avatar/8be5a969c9dd715a4a892d9d80310c0c?d=https%3A%2F%2Fidenticons.github.com%2F44b85a826320c41cb1a2337578cb43a9.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="punytan" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=punytan"><img alt="punytan" class=" js-avatar" data-user="226746" height="20" src="https://2.gravatar.com/avatar/a49e5bbf258c037fe824064eefaa6f71?d=https%3A%2F%2Fidenticons.github.com%2F4e54060fe7bd4bb77231e9ab8c203f7b.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="tybulewicz" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=tybulewicz"><img alt="Tomasz Tybulewicz" class=" js-avatar" data-user="653714" height="20" src="https://2.gravatar.com/avatar/b9f1de58f6628ba118ed5f59063a2706?d=https%3A%2F%2Fidenticons.github.com%2F23d0ad303b4883b856ce0760d612e88d.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="cboden" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=cboden"><img alt="Chris Boden" class=" js-avatar" data-user="617694" height="20" src="https://1.gravatar.com/avatar/e64cdd88cc31a6f8423237f38a0c97eb?d=https%3A%2F%2Fidenticons.github.com%2F3131afceca6549e869b2e93823722c25.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="xorrizon" href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js?author=xorrizon"><img alt="Daniel P" class=" js-avatar" data-user="405943" height="20" src="https://0.gravatar.com/avatar/b3ed91bcff3e620f2cbbfc1cdb8eb658?d=https%3A%2F%2Fidenticons.github.com%2F9324ba722f617d357c6408835dcf8665.png&amp;r=x&amp;s=140" width="20" /></a>


    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img alt="Ben Brown" class=" js-avatar" data-user="729873" height="24" src="https://0.gravatar.com/avatar/e8ea053f7813c4e2ea7614ab957476ac?d=https%3A%2F%2Fidenticons.github.com%2Fa75fe035d677f8c542feee2d1221644b.png&amp;r=x&amp;s=140" width="24" />
            <a href="/benbrown">benbrown</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Sebastian Motraghi" class=" js-avatar" data-user="188161" height="24" src="https://0.gravatar.com/avatar/2533b34dceec1e38ab4d6eed2606c878?d=https%3A%2F%2Fidenticons.github.com%2F1bbd0f2b931ea8a6fca19e8cb29f3936.png&amp;r=x&amp;s=140" width="24" />
            <a href="/sebm">sebm</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Mario Estrada" class=" js-avatar" data-user="47727" height="24" src="https://2.gravatar.com/avatar/fbf5625265bca97681fe411525e5fd2e?d=https%3A%2F%2Fidenticons.github.com%2F7a2af65d5b4d03e85908eaddc6fbdad9.png&amp;r=x&amp;s=140" width="24" />
            <a href="/marioestrada">marioestrada</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="melkorm" class=" js-avatar" data-user="619996" height="24" src="https://0.gravatar.com/avatar/5200d321cadcb78efe0cff62faa69a1c?d=https%3A%2F%2Fidenticons.github.com%2Fd289d8f42874f7f7f8ccd9b13f5d79ab.png&amp;r=x&amp;s=140" width="24" />
            <a href="/devbrothers">devbrothers</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Erlend Finvåg" class=" js-avatar" data-user="4634" height="24" src="https://2.gravatar.com/avatar/d5167c28cf6ac6fb84dbeced4d9b1ba1?d=https%3A%2F%2Fidenticons.github.com%2F18fc72d8b8aba03a4d84f66efabce82e.png&amp;r=x&amp;s=140" width="24" />
            <a href="/erlend">erlend</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Javier Toledo" class=" js-avatar" data-user="175096" height="24" src="https://0.gravatar.com/avatar/d2224d4b9a33268223621ca9a5e3b369?d=https%3A%2F%2Fidenticons.github.com%2Fab4cd3bbcc149c5bbcacea137fb87e86.png&amp;r=x&amp;s=140" width="24" />
            <a href="/javiertoledo">javiertoledo</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Jay Levitt" class=" js-avatar" data-user="11246" height="24" src="https://2.gravatar.com/avatar/b8aca816cb8646a855175f64bdfa2838?d=https%3A%2F%2Fidenticons.github.com%2Fc99e757a469e0631c1a61e97949885f1.png&amp;r=x&amp;s=140" width="24" />
            <a href="/jaylevitt">jaylevitt</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="David Haslem" class=" js-avatar" data-user="18348" height="24" src="https://0.gravatar.com/avatar/713d855987c52e0f414df57217427f54?d=https%3A%2F%2Fidenticons.github.com%2Fce6907d94233d611e2f8349ab3b38264.png&amp;r=x&amp;s=140" width="24" />
            <a href="/therabidbanana">therabidbanana</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Maxime Corson" class=" js-avatar" data-user="1563876" height="24" src="https://0.gravatar.com/avatar/95628a22a5c2244dd2bc67129930ab81?d=https%3A%2F%2Fidenticons.github.com%2F5c43e714558e266e24596dcd760e7f9a.png&amp;r=x&amp;s=140" width="24" />
            <a href="/Maxooo">Maxooo</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Łukasz Mierzwa" class=" js-avatar" data-user="114288" height="24" src="https://1.gravatar.com/avatar/8be5a969c9dd715a4a892d9d80310c0c?d=https%3A%2F%2Fidenticons.github.com%2F44b85a826320c41cb1a2337578cb43a9.png&amp;r=x&amp;s=140" width="24" />
            <a href="/prymitive">prymitive</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="punytan" class=" js-avatar" data-user="226746" height="24" src="https://2.gravatar.com/avatar/a49e5bbf258c037fe824064eefaa6f71?d=https%3A%2F%2Fidenticons.github.com%2F4e54060fe7bd4bb77231e9ab8c203f7b.png&amp;r=x&amp;s=140" width="24" />
            <a href="/punytan">punytan</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Tomasz Tybulewicz" class=" js-avatar" data-user="653714" height="24" src="https://2.gravatar.com/avatar/b9f1de58f6628ba118ed5f59063a2706?d=https%3A%2F%2Fidenticons.github.com%2F23d0ad303b4883b856ce0760d612e88d.png&amp;r=x&amp;s=140" width="24" />
            <a href="/tybulewicz">tybulewicz</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Chris Boden" class=" js-avatar" data-user="617694" height="24" src="https://1.gravatar.com/avatar/e64cdd88cc31a6f8423237f38a0c97eb?d=https%3A%2F%2Fidenticons.github.com%2F3131afceca6549e869b2e93823722c25.png&amp;r=x&amp;s=140" width="24" />
            <a href="/cboden">cboden</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Daniel P" class=" js-avatar" data-user="405943" height="24" src="https://0.gravatar.com/avatar/b3ed91bcff3e620f2cbbfc1cdb8eb658?d=https%3A%2F%2Fidenticons.github.com%2F9324ba722f617d357c6408835dcf8665.png&amp;r=x&amp;s=140" width="24" />
            <a href="/xorrizon">xorrizon</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">file</span>
        <span class="meta-divider"></span>
          <span>355 lines (296 sloc)</span>
          <span class="meta-divider"></span>
        <span>11.537 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped tooltipped-w js-conduit-openfile-check"
               href="http://mac.github.com"
               data-url="github-mac://openRepo/https://github.com/xoxco/jQuery-Tags-Input?branch=master&amp;filepath=jquery.tagsinput.js"
               aria-label="Open this file in GitHub for Mac"
               data-failed-title="Your version of GitHub for Mac is too old to open this file. Try checking for updates.">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
              <a class="minibutton disabled tooltipped tooltipped-w" href="#"
                 aria-label="You must be signed in to make or propose changes">Edit</a>
          <a href="/xoxco/jQuery-Tags-Input/raw/master/jquery.tagsinput.js" class="button minibutton " id="raw-url">Raw</a>
            <a href="/xoxco/jQuery-Tags-Input/blame/master/jquery.tagsinput.js" class="button minibutton js-update-url-with-hash">Blame</a>
          <a href="/xoxco/jQuery-Tags-Input/commits/master/jquery.tagsinput.js" class="button minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->
          <a class="minibutton danger disabled empty-icon tooltipped tooltipped-w" href="#"
             aria-label="You must be signed in to make or propose changes">
          Delete
        </a>
      </div><!-- /.actions -->
    </div>
        <div class="blob-wrapper data type-javascript js-blob-data">
        <table class="file-code file-diff tab-size-8">
          <tr class="file-code-line">
            <td class="blob-line-nums">
              <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>
<span id="L183" rel="#L183">183</span>
<span id="L184" rel="#L184">184</span>
<span id="L185" rel="#L185">185</span>
<span id="L186" rel="#L186">186</span>
<span id="L187" rel="#L187">187</span>
<span id="L188" rel="#L188">188</span>
<span id="L189" rel="#L189">189</span>
<span id="L190" rel="#L190">190</span>
<span id="L191" rel="#L191">191</span>
<span id="L192" rel="#L192">192</span>
<span id="L193" rel="#L193">193</span>
<span id="L194" rel="#L194">194</span>
<span id="L195" rel="#L195">195</span>
<span id="L196" rel="#L196">196</span>
<span id="L197" rel="#L197">197</span>
<span id="L198" rel="#L198">198</span>
<span id="L199" rel="#L199">199</span>
<span id="L200" rel="#L200">200</span>
<span id="L201" rel="#L201">201</span>
<span id="L202" rel="#L202">202</span>
<span id="L203" rel="#L203">203</span>
<span id="L204" rel="#L204">204</span>
<span id="L205" rel="#L205">205</span>
<span id="L206" rel="#L206">206</span>
<span id="L207" rel="#L207">207</span>
<span id="L208" rel="#L208">208</span>
<span id="L209" rel="#L209">209</span>
<span id="L210" rel="#L210">210</span>
<span id="L211" rel="#L211">211</span>
<span id="L212" rel="#L212">212</span>
<span id="L213" rel="#L213">213</span>
<span id="L214" rel="#L214">214</span>
<span id="L215" rel="#L215">215</span>
<span id="L216" rel="#L216">216</span>
<span id="L217" rel="#L217">217</span>
<span id="L218" rel="#L218">218</span>
<span id="L219" rel="#L219">219</span>
<span id="L220" rel="#L220">220</span>
<span id="L221" rel="#L221">221</span>
<span id="L222" rel="#L222">222</span>
<span id="L223" rel="#L223">223</span>
<span id="L224" rel="#L224">224</span>
<span id="L225" rel="#L225">225</span>
<span id="L226" rel="#L226">226</span>
<span id="L227" rel="#L227">227</span>
<span id="L228" rel="#L228">228</span>
<span id="L229" rel="#L229">229</span>
<span id="L230" rel="#L230">230</span>
<span id="L231" rel="#L231">231</span>
<span id="L232" rel="#L232">232</span>
<span id="L233" rel="#L233">233</span>
<span id="L234" rel="#L234">234</span>
<span id="L235" rel="#L235">235</span>
<span id="L236" rel="#L236">236</span>
<span id="L237" rel="#L237">237</span>
<span id="L238" rel="#L238">238</span>
<span id="L239" rel="#L239">239</span>
<span id="L240" rel="#L240">240</span>
<span id="L241" rel="#L241">241</span>
<span id="L242" rel="#L242">242</span>
<span id="L243" rel="#L243">243</span>
<span id="L244" rel="#L244">244</span>
<span id="L245" rel="#L245">245</span>
<span id="L246" rel="#L246">246</span>
<span id="L247" rel="#L247">247</span>
<span id="L248" rel="#L248">248</span>
<span id="L249" rel="#L249">249</span>
<span id="L250" rel="#L250">250</span>
<span id="L251" rel="#L251">251</span>
<span id="L252" rel="#L252">252</span>
<span id="L253" rel="#L253">253</span>
<span id="L254" rel="#L254">254</span>
<span id="L255" rel="#L255">255</span>
<span id="L256" rel="#L256">256</span>
<span id="L257" rel="#L257">257</span>
<span id="L258" rel="#L258">258</span>
<span id="L259" rel="#L259">259</span>
<span id="L260" rel="#L260">260</span>
<span id="L261" rel="#L261">261</span>
<span id="L262" rel="#L262">262</span>
<span id="L263" rel="#L263">263</span>
<span id="L264" rel="#L264">264</span>
<span id="L265" rel="#L265">265</span>
<span id="L266" rel="#L266">266</span>
<span id="L267" rel="#L267">267</span>
<span id="L268" rel="#L268">268</span>
<span id="L269" rel="#L269">269</span>
<span id="L270" rel="#L270">270</span>
<span id="L271" rel="#L271">271</span>
<span id="L272" rel="#L272">272</span>
<span id="L273" rel="#L273">273</span>
<span id="L274" rel="#L274">274</span>
<span id="L275" rel="#L275">275</span>
<span id="L276" rel="#L276">276</span>
<span id="L277" rel="#L277">277</span>
<span id="L278" rel="#L278">278</span>
<span id="L279" rel="#L279">279</span>
<span id="L280" rel="#L280">280</span>
<span id="L281" rel="#L281">281</span>
<span id="L282" rel="#L282">282</span>
<span id="L283" rel="#L283">283</span>
<span id="L284" rel="#L284">284</span>
<span id="L285" rel="#L285">285</span>
<span id="L286" rel="#L286">286</span>
<span id="L287" rel="#L287">287</span>
<span id="L288" rel="#L288">288</span>
<span id="L289" rel="#L289">289</span>
<span id="L290" rel="#L290">290</span>
<span id="L291" rel="#L291">291</span>
<span id="L292" rel="#L292">292</span>
<span id="L293" rel="#L293">293</span>
<span id="L294" rel="#L294">294</span>
<span id="L295" rel="#L295">295</span>
<span id="L296" rel="#L296">296</span>
<span id="L297" rel="#L297">297</span>
<span id="L298" rel="#L298">298</span>
<span id="L299" rel="#L299">299</span>
<span id="L300" rel="#L300">300</span>
<span id="L301" rel="#L301">301</span>
<span id="L302" rel="#L302">302</span>
<span id="L303" rel="#L303">303</span>
<span id="L304" rel="#L304">304</span>
<span id="L305" rel="#L305">305</span>
<span id="L306" rel="#L306">306</span>
<span id="L307" rel="#L307">307</span>
<span id="L308" rel="#L308">308</span>
<span id="L309" rel="#L309">309</span>
<span id="L310" rel="#L310">310</span>
<span id="L311" rel="#L311">311</span>
<span id="L312" rel="#L312">312</span>
<span id="L313" rel="#L313">313</span>
<span id="L314" rel="#L314">314</span>
<span id="L315" rel="#L315">315</span>
<span id="L316" rel="#L316">316</span>
<span id="L317" rel="#L317">317</span>
<span id="L318" rel="#L318">318</span>
<span id="L319" rel="#L319">319</span>
<span id="L320" rel="#L320">320</span>
<span id="L321" rel="#L321">321</span>
<span id="L322" rel="#L322">322</span>
<span id="L323" rel="#L323">323</span>
<span id="L324" rel="#L324">324</span>
<span id="L325" rel="#L325">325</span>
<span id="L326" rel="#L326">326</span>
<span id="L327" rel="#L327">327</span>
<span id="L328" rel="#L328">328</span>
<span id="L329" rel="#L329">329</span>
<span id="L330" rel="#L330">330</span>
<span id="L331" rel="#L331">331</span>
<span id="L332" rel="#L332">332</span>
<span id="L333" rel="#L333">333</span>
<span id="L334" rel="#L334">334</span>
<span id="L335" rel="#L335">335</span>
<span id="L336" rel="#L336">336</span>
<span id="L337" rel="#L337">337</span>
<span id="L338" rel="#L338">338</span>
<span id="L339" rel="#L339">339</span>
<span id="L340" rel="#L340">340</span>
<span id="L341" rel="#L341">341</span>
<span id="L342" rel="#L342">342</span>
<span id="L343" rel="#L343">343</span>
<span id="L344" rel="#L344">344</span>
<span id="L345" rel="#L345">345</span>
<span id="L346" rel="#L346">346</span>
<span id="L347" rel="#L347">347</span>
<span id="L348" rel="#L348">348</span>
<span id="L349" rel="#L349">349</span>
<span id="L350" rel="#L350">350</span>
<span id="L351" rel="#L351">351</span>
<span id="L352" rel="#L352">352</span>
<span id="L353" rel="#L353">353</span>
<span id="L354" rel="#L354">354</span>

            </td>
            <td class="blob-line-code"><div class="code-body highlight"><pre><div class='line' id='LC1'><span class="cm">/*</span></div><div class='line' id='LC2'><br/></div><div class='line' id='LC3'><span class="cm">	jQuery Tags Input Plugin 1.3.3</span></div><div class='line' id='LC4'><span class="cm">	</span></div><div class='line' id='LC5'><span class="cm">	Copyright (c) 2011 XOXCO, Inc</span></div><div class='line' id='LC6'><span class="cm">	</span></div><div class='line' id='LC7'><span class="cm">	Documentation for this plugin lives here:</span></div><div class='line' id='LC8'><span class="cm">	http://xoxco.com/clickable/jquery-tags-input</span></div><div class='line' id='LC9'><span class="cm">	</span></div><div class='line' id='LC10'><span class="cm">	Licensed under the MIT license:</span></div><div class='line' id='LC11'><span class="cm">	http://www.opensource.org/licenses/mit-license.php</span></div><div class='line' id='LC12'><br/></div><div class='line' id='LC13'><span class="cm">	ben@xoxco.com</span></div><div class='line' id='LC14'><br/></div><div class='line' id='LC15'><span class="cm">*/</span></div><div class='line' id='LC16'><br/></div><div class='line' id='LC17'><span class="p">(</span><span class="kd">function</span><span class="p">(</span><span class="nx">$</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC18'><br/></div><div class='line' id='LC19'>	<span class="kd">var</span> <span class="nx">delimiter</span> <span class="o">=</span> <span class="k">new</span> <span class="nb">Array</span><span class="p">();</span></div><div class='line' id='LC20'>	<span class="kd">var</span> <span class="nx">tags_callbacks</span> <span class="o">=</span> <span class="k">new</span> <span class="nb">Array</span><span class="p">();</span></div><div class='line' id='LC21'>	<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">doAutosize</span> <span class="o">=</span> <span class="kd">function</span><span class="p">(</span><span class="nx">o</span><span class="p">){</span></div><div class='line' id='LC22'>	    <span class="kd">var</span> <span class="nx">minWidth</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">data</span><span class="p">(</span><span class="s1">&#39;minwidth&#39;</span><span class="p">),</span></div><div class='line' id='LC23'>	        <span class="nx">maxWidth</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">data</span><span class="p">(</span><span class="s1">&#39;maxwidth&#39;</span><span class="p">),</span></div><div class='line' id='LC24'>	        <span class="nx">val</span> <span class="o">=</span> <span class="s1">&#39;&#39;</span><span class="p">,</span></div><div class='line' id='LC25'>	        <span class="nx">input</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">),</span></div><div class='line' id='LC26'>	        <span class="nx">testSubject</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">data</span><span class="p">(</span><span class="s1">&#39;tester_id&#39;</span><span class="p">));</span></div><div class='line' id='LC27'><br/></div><div class='line' id='LC28'>	    <span class="k">if</span> <span class="p">(</span><span class="nx">val</span> <span class="o">===</span> <span class="p">(</span><span class="nx">val</span> <span class="o">=</span> <span class="nx">input</span><span class="p">.</span><span class="nx">val</span><span class="p">()))</span> <span class="p">{</span><span class="k">return</span><span class="p">;}</span></div><div class='line' id='LC29'><br/></div><div class='line' id='LC30'>	    <span class="c1">// Enter new content into testSubject</span></div><div class='line' id='LC31'>	    <span class="kd">var</span> <span class="nx">escaped</span> <span class="o">=</span> <span class="nx">val</span><span class="p">.</span><span class="nx">replace</span><span class="p">(</span><span class="sr">/&amp;/g</span><span class="p">,</span> <span class="s1">&#39;&amp;amp;&#39;</span><span class="p">).</span><span class="nx">replace</span><span class="p">(</span><span class="sr">/\s/g</span><span class="p">,</span><span class="s1">&#39; &#39;</span><span class="p">).</span><span class="nx">replace</span><span class="p">(</span><span class="sr">/&lt;/g</span><span class="p">,</span> <span class="s1">&#39;&amp;lt;&#39;</span><span class="p">).</span><span class="nx">replace</span><span class="p">(</span><span class="sr">/&gt;/g</span><span class="p">,</span> <span class="s1">&#39;&amp;gt;&#39;</span><span class="p">);</span></div><div class='line' id='LC32'>	    <span class="nx">testSubject</span><span class="p">.</span><span class="nx">html</span><span class="p">(</span><span class="nx">escaped</span><span class="p">);</span></div><div class='line' id='LC33'>	    <span class="c1">// Calculate new width + whether to change</span></div><div class='line' id='LC34'>	    <span class="kd">var</span> <span class="nx">testerWidth</span> <span class="o">=</span> <span class="nx">testSubject</span><span class="p">.</span><span class="nx">width</span><span class="p">(),</span></div><div class='line' id='LC35'>	        <span class="nx">newWidth</span> <span class="o">=</span> <span class="p">(</span><span class="nx">testerWidth</span> <span class="o">+</span> <span class="nx">o</span><span class="p">.</span><span class="nx">comfortZone</span><span class="p">)</span> <span class="o">&gt;=</span> <span class="nx">minWidth</span> <span class="o">?</span> <span class="nx">testerWidth</span> <span class="o">+</span> <span class="nx">o</span><span class="p">.</span><span class="nx">comfortZone</span> <span class="o">:</span> <span class="nx">minWidth</span><span class="p">,</span></div><div class='line' id='LC36'>	        <span class="nx">currentWidth</span> <span class="o">=</span> <span class="nx">input</span><span class="p">.</span><span class="nx">width</span><span class="p">(),</span></div><div class='line' id='LC37'>	        <span class="nx">isValidWidthChange</span> <span class="o">=</span> <span class="p">(</span><span class="nx">newWidth</span> <span class="o">&lt;</span> <span class="nx">currentWidth</span> <span class="o">&amp;&amp;</span> <span class="nx">newWidth</span> <span class="o">&gt;=</span> <span class="nx">minWidth</span><span class="p">)</span></div><div class='line' id='LC38'>	                             <span class="o">||</span> <span class="p">(</span><span class="nx">newWidth</span> <span class="o">&gt;</span> <span class="nx">minWidth</span> <span class="o">&amp;&amp;</span> <span class="nx">newWidth</span> <span class="o">&lt;</span> <span class="nx">maxWidth</span><span class="p">);</span></div><div class='line' id='LC39'><br/></div><div class='line' id='LC40'>	    <span class="c1">// Animate width</span></div><div class='line' id='LC41'>	    <span class="k">if</span> <span class="p">(</span><span class="nx">isValidWidthChange</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC42'>	        <span class="nx">input</span><span class="p">.</span><span class="nx">width</span><span class="p">(</span><span class="nx">newWidth</span><span class="p">);</span></div><div class='line' id='LC43'>	    <span class="p">}</span></div><div class='line' id='LC44'><br/></div><div class='line' id='LC45'><br/></div><div class='line' id='LC46'>&nbsp;&nbsp;<span class="p">};</span></div><div class='line' id='LC47'>&nbsp;&nbsp;<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">resetAutosize</span> <span class="o">=</span> <span class="kd">function</span><span class="p">(</span><span class="nx">options</span><span class="p">){</span></div><div class='line' id='LC48'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// alert(JSON.stringify(options));</span></div><div class='line' id='LC49'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">var</span> <span class="nx">minWidth</span> <span class="o">=</span>  <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">data</span><span class="p">(</span><span class="s1">&#39;minwidth&#39;</span><span class="p">)</span> <span class="o">||</span> <span class="nx">options</span><span class="p">.</span><span class="nx">minInputWidth</span> <span class="o">||</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">width</span><span class="p">(),</span></div><div class='line' id='LC50'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">maxWidth</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">data</span><span class="p">(</span><span class="s1">&#39;maxwidth&#39;</span><span class="p">)</span> <span class="o">||</span> <span class="nx">options</span><span class="p">.</span><span class="nx">maxInputWidth</span> <span class="o">||</span> <span class="p">(</span><span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">closest</span><span class="p">(</span><span class="s1">&#39;.tagsinput&#39;</span><span class="p">).</span><span class="nx">width</span><span class="p">()</span> <span class="o">-</span> <span class="nx">options</span><span class="p">.</span><span class="nx">inputPadding</span><span class="p">),</span></div><div class='line' id='LC51'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">val</span> <span class="o">=</span> <span class="s1">&#39;&#39;</span><span class="p">,</span></div><div class='line' id='LC52'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">input</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">),</span></div><div class='line' id='LC53'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">testSubject</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="s1">&#39;&lt;tester/&gt;&#39;</span><span class="p">).</span><span class="nx">css</span><span class="p">({</span></div><div class='line' id='LC54'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">position</span><span class="o">:</span> <span class="s1">&#39;absolute&#39;</span><span class="p">,</span></div><div class='line' id='LC55'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">top</span><span class="o">:</span> <span class="o">-</span><span class="mi">9999</span><span class="p">,</span></div><div class='line' id='LC56'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">left</span><span class="o">:</span> <span class="o">-</span><span class="mi">9999</span><span class="p">,</span></div><div class='line' id='LC57'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">width</span><span class="o">:</span> <span class="s1">&#39;auto&#39;</span><span class="p">,</span></div><div class='line' id='LC58'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">fontSize</span><span class="o">:</span> <span class="nx">input</span><span class="p">.</span><span class="nx">css</span><span class="p">(</span><span class="s1">&#39;fontSize&#39;</span><span class="p">),</span></div><div class='line' id='LC59'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">fontFamily</span><span class="o">:</span> <span class="nx">input</span><span class="p">.</span><span class="nx">css</span><span class="p">(</span><span class="s1">&#39;fontFamily&#39;</span><span class="p">),</span></div><div class='line' id='LC60'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">fontWeight</span><span class="o">:</span> <span class="nx">input</span><span class="p">.</span><span class="nx">css</span><span class="p">(</span><span class="s1">&#39;fontWeight&#39;</span><span class="p">),</span></div><div class='line' id='LC61'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">letterSpacing</span><span class="o">:</span> <span class="nx">input</span><span class="p">.</span><span class="nx">css</span><span class="p">(</span><span class="s1">&#39;letterSpacing&#39;</span><span class="p">),</span></div><div class='line' id='LC62'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">whiteSpace</span><span class="o">:</span> <span class="s1">&#39;nowrap&#39;</span></div><div class='line' id='LC63'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">}),</span></div><div class='line' id='LC64'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">testerId</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">)</span><span class="o">+</span><span class="s1">&#39;_autosize_tester&#39;</span><span class="p">;</span></div><div class='line' id='LC65'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="p">(</span><span class="o">!</span> <span class="nx">$</span><span class="p">(</span><span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">testerId</span><span class="p">).</span><span class="nx">length</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="p">){</span></div><div class='line' id='LC66'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">testSubject</span><span class="p">.</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">,</span> <span class="nx">testerId</span><span class="p">);</span></div><div class='line' id='LC67'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">testSubject</span><span class="p">.</span><span class="nx">appendTo</span><span class="p">(</span><span class="s1">&#39;body&#39;</span><span class="p">);</span></div><div class='line' id='LC68'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">}</span></div><div class='line' id='LC69'><br/></div><div class='line' id='LC70'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">input</span><span class="p">.</span><span class="nx">data</span><span class="p">(</span><span class="s1">&#39;minwidth&#39;</span><span class="p">,</span> <span class="nx">minWidth</span><span class="p">);</span></div><div class='line' id='LC71'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">input</span><span class="p">.</span><span class="nx">data</span><span class="p">(</span><span class="s1">&#39;maxwidth&#39;</span><span class="p">,</span> <span class="nx">maxWidth</span><span class="p">);</span></div><div class='line' id='LC72'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">input</span><span class="p">.</span><span class="nx">data</span><span class="p">(</span><span class="s1">&#39;tester_id&#39;</span><span class="p">,</span> <span class="nx">testerId</span><span class="p">);</span></div><div class='line' id='LC73'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">input</span><span class="p">.</span><span class="nx">css</span><span class="p">(</span><span class="s1">&#39;width&#39;</span><span class="p">,</span> <span class="nx">minWidth</span><span class="p">);</span></div><div class='line' id='LC74'>&nbsp;&nbsp;<span class="p">};</span></div><div class='line' id='LC75'>&nbsp;&nbsp;</div><div class='line' id='LC76'>	<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">addTag</span> <span class="o">=</span> <span class="kd">function</span><span class="p">(</span><span class="nx">value</span><span class="p">,</span><span class="nx">options</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC77'>			<span class="nx">options</span> <span class="o">=</span> <span class="nx">jQuery</span><span class="p">.</span><span class="nx">extend</span><span class="p">({</span><span class="nx">focus</span><span class="o">:</span><span class="kc">false</span><span class="p">,</span><span class="nx">callback</span><span class="o">:</span><span class="kc">true</span><span class="p">},</span><span class="nx">options</span><span class="p">);</span></div><div class='line' id='LC78'>			<span class="k">this</span><span class="p">.</span><span class="nx">each</span><span class="p">(</span><span class="kd">function</span><span class="p">()</span> <span class="p">{</span> </div><div class='line' id='LC79'>				<span class="kd">var</span> <span class="nx">id</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">);</span></div><div class='line' id='LC80'><br/></div><div class='line' id='LC81'>				<span class="kd">var</span> <span class="nx">tagslist</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">val</span><span class="p">().</span><span class="nx">split</span><span class="p">(</span><span class="nx">delimiter</span><span class="p">[</span><span class="nx">id</span><span class="p">]);</span></div><div class='line' id='LC82'>				<span class="k">if</span> <span class="p">(</span><span class="nx">tagslist</span><span class="p">[</span><span class="mi">0</span><span class="p">]</span> <span class="o">==</span> <span class="s1">&#39;&#39;</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC83'>					<span class="nx">tagslist</span> <span class="o">=</span> <span class="k">new</span> <span class="nb">Array</span><span class="p">();</span></div><div class='line' id='LC84'>				<span class="p">}</span></div><div class='line' id='LC85'><br/></div><div class='line' id='LC86'>				<span class="nx">value</span> <span class="o">=</span> <span class="nx">jQuery</span><span class="p">.</span><span class="nx">trim</span><span class="p">(</span><span class="nx">value</span><span class="p">);</span></div><div class='line' id='LC87'><br/></div><div class='line' id='LC88'>				<span class="k">if</span> <span class="p">(</span><span class="nx">options</span><span class="p">.</span><span class="nx">unique</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC89'>					<span class="kd">var</span> <span class="nx">skipTag</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">tagExist</span><span class="p">(</span><span class="nx">value</span><span class="p">);</span></div><div class='line' id='LC90'>					<span class="k">if</span><span class="p">(</span><span class="nx">skipTag</span> <span class="o">==</span> <span class="kc">true</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC91'>					    <span class="c1">//Marks fake input as not_valid to let styling it</span></div><div class='line' id='LC92'>&nbsp;&nbsp;&nbsp;&nbsp;				    <span class="nx">$</span><span class="p">(</span><span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_tag&#39;</span><span class="p">).</span><span class="nx">addClass</span><span class="p">(</span><span class="s1">&#39;not_valid&#39;</span><span class="p">);</span></div><div class='line' id='LC93'>&nbsp;&nbsp;&nbsp;&nbsp;				<span class="p">}</span></div><div class='line' id='LC94'>				<span class="p">}</span> <span class="k">else</span> <span class="p">{</span></div><div class='line' id='LC95'>					<span class="kd">var</span> <span class="nx">skipTag</span> <span class="o">=</span> <span class="kc">false</span><span class="p">;</span> </div><div class='line' id='LC96'>				<span class="p">}</span></div><div class='line' id='LC97'><br/></div><div class='line' id='LC98'>				<span class="k">if</span> <span class="p">(</span><span class="nx">value</span> <span class="o">!=</span><span class="s1">&#39;&#39;</span> <span class="o">&amp;&amp;</span> <span class="nx">skipTag</span> <span class="o">!=</span> <span class="kc">true</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC99'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">$</span><span class="p">(</span><span class="s1">&#39;&lt;span&gt;&#39;</span><span class="p">).</span><span class="nx">addClass</span><span class="p">(</span><span class="s1">&#39;tag&#39;</span><span class="p">).</span><span class="nx">append</span><span class="p">(</span></div><div class='line' id='LC100'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">$</span><span class="p">(</span><span class="s1">&#39;&lt;span&gt;&#39;</span><span class="p">).</span><span class="nx">text</span><span class="p">(</span><span class="nx">value</span><span class="p">).</span><span class="nx">append</span><span class="p">(</span><span class="s1">&#39;&amp;nbsp;&amp;nbsp;&#39;</span><span class="p">),</span></div><div class='line' id='LC101'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">$</span><span class="p">(</span><span class="s1">&#39;&lt;a&gt;&#39;</span><span class="p">,</span> <span class="p">{</span></div><div class='line' id='LC102'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">href</span>  <span class="o">:</span> <span class="s1">&#39;#&#39;</span><span class="p">,</span></div><div class='line' id='LC103'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">title</span> <span class="o">:</span> <span class="s1">&#39;Removing tag&#39;</span><span class="p">,</span></div><div class='line' id='LC104'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">text</span>  <span class="o">:</span> <span class="s1">&#39;x&#39;</span></div><div class='line' id='LC105'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">}).</span><span class="nx">click</span><span class="p">(</span><span class="kd">function</span> <span class="p">()</span> <span class="p">{</span></div><div class='line' id='LC106'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nx">$</span><span class="p">(</span><span class="s1">&#39;#&#39;</span> <span class="o">+</span> <span class="nx">id</span><span class="p">).</span><span class="nx">removeTag</span><span class="p">(</span><span class="nx">escape</span><span class="p">(</span><span class="nx">value</span><span class="p">));</span></div><div class='line' id='LC107'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">})</span></div><div class='line' id='LC108'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">).</span><span class="nx">insertBefore</span><span class="p">(</span><span class="s1">&#39;#&#39;</span> <span class="o">+</span> <span class="nx">id</span> <span class="o">+</span> <span class="s1">&#39;_addTag&#39;</span><span class="p">);</span></div><div class='line' id='LC109'><br/></div><div class='line' id='LC110'>					<span class="nx">tagslist</span><span class="p">.</span><span class="nx">push</span><span class="p">(</span><span class="nx">value</span><span class="p">);</span></div><div class='line' id='LC111'><br/></div><div class='line' id='LC112'>					<span class="nx">$</span><span class="p">(</span><span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_tag&#39;</span><span class="p">).</span><span class="nx">val</span><span class="p">(</span><span class="s1">&#39;&#39;</span><span class="p">);</span></div><div class='line' id='LC113'>					<span class="k">if</span> <span class="p">(</span><span class="nx">options</span><span class="p">.</span><span class="nx">focus</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC114'>						<span class="nx">$</span><span class="p">(</span><span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_tag&#39;</span><span class="p">).</span><span class="nx">focus</span><span class="p">();</span></div><div class='line' id='LC115'>					<span class="p">}</span> <span class="k">else</span> <span class="p">{</span>		</div><div class='line' id='LC116'>						<span class="nx">$</span><span class="p">(</span><span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_tag&#39;</span><span class="p">).</span><span class="nx">blur</span><span class="p">();</span></div><div class='line' id='LC117'>					<span class="p">}</span></div><div class='line' id='LC118'><br/></div><div class='line' id='LC119'>					<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">tagsInput</span><span class="p">.</span><span class="nx">updateTagsField</span><span class="p">(</span><span class="k">this</span><span class="p">,</span><span class="nx">tagslist</span><span class="p">);</span></div><div class='line' id='LC120'><br/></div><div class='line' id='LC121'>					<span class="k">if</span> <span class="p">(</span><span class="nx">options</span><span class="p">.</span><span class="nx">callback</span> <span class="o">&amp;&amp;</span> <span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">]</span> <span class="o">&amp;&amp;</span> <span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">][</span><span class="s1">&#39;onAddTag&#39;</span><span class="p">])</span> <span class="p">{</span></div><div class='line' id='LC122'>						<span class="kd">var</span> <span class="nx">f</span> <span class="o">=</span> <span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">][</span><span class="s1">&#39;onAddTag&#39;</span><span class="p">];</span></div><div class='line' id='LC123'>						<span class="nx">f</span><span class="p">.</span><span class="nx">call</span><span class="p">(</span><span class="k">this</span><span class="p">,</span> <span class="nx">value</span><span class="p">);</span></div><div class='line' id='LC124'>					<span class="p">}</span></div><div class='line' id='LC125'>					<span class="k">if</span><span class="p">(</span><span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">]</span> <span class="o">&amp;&amp;</span> <span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">][</span><span class="s1">&#39;onChange&#39;</span><span class="p">])</span></div><div class='line' id='LC126'>					<span class="p">{</span></div><div class='line' id='LC127'>						<span class="kd">var</span> <span class="nx">i</span> <span class="o">=</span> <span class="nx">tagslist</span><span class="p">.</span><span class="nx">length</span><span class="p">;</span></div><div class='line' id='LC128'>						<span class="kd">var</span> <span class="nx">f</span> <span class="o">=</span> <span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">][</span><span class="s1">&#39;onChange&#39;</span><span class="p">];</span></div><div class='line' id='LC129'>						<span class="nx">f</span><span class="p">.</span><span class="nx">call</span><span class="p">(</span><span class="k">this</span><span class="p">,</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">),</span> <span class="nx">tagslist</span><span class="p">[</span><span class="nx">i</span><span class="o">-</span><span class="mi">1</span><span class="p">]);</span></div><div class='line' id='LC130'>					<span class="p">}</span>					</div><div class='line' id='LC131'>				<span class="p">}</span></div><div class='line' id='LC132'><br/></div><div class='line' id='LC133'>			<span class="p">});</span>		</div><div class='line' id='LC134'><br/></div><div class='line' id='LC135'>			<span class="k">return</span> <span class="kc">false</span><span class="p">;</span></div><div class='line' id='LC136'>		<span class="p">};</span></div><div class='line' id='LC137'><br/></div><div class='line' id='LC138'>	<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">removeTag</span> <span class="o">=</span> <span class="kd">function</span><span class="p">(</span><span class="nx">value</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC139'>			<span class="nx">value</span> <span class="o">=</span> <span class="nx">unescape</span><span class="p">(</span><span class="nx">value</span><span class="p">);</span></div><div class='line' id='LC140'>			<span class="k">this</span><span class="p">.</span><span class="nx">each</span><span class="p">(</span><span class="kd">function</span><span class="p">()</span> <span class="p">{</span> </div><div class='line' id='LC141'>				<span class="kd">var</span> <span class="nx">id</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">);</span></div><div class='line' id='LC142'><br/></div><div class='line' id='LC143'>				<span class="kd">var</span> <span class="nx">old</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">val</span><span class="p">().</span><span class="nx">split</span><span class="p">(</span><span class="nx">delimiter</span><span class="p">[</span><span class="nx">id</span><span class="p">]);</span></div><div class='line' id='LC144'><br/></div><div class='line' id='LC145'>				<span class="nx">$</span><span class="p">(</span><span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_tagsinput .tag&#39;</span><span class="p">).</span><span class="nx">remove</span><span class="p">();</span></div><div class='line' id='LC146'>				<span class="nx">str</span> <span class="o">=</span> <span class="s1">&#39;&#39;</span><span class="p">;</span></div><div class='line' id='LC147'>				<span class="k">for</span> <span class="p">(</span><span class="nx">i</span><span class="o">=</span><span class="mi">0</span><span class="p">;</span> <span class="nx">i</span><span class="o">&lt;</span> <span class="nx">old</span><span class="p">.</span><span class="nx">length</span><span class="p">;</span> <span class="nx">i</span><span class="o">++</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC148'>					<span class="k">if</span> <span class="p">(</span><span class="nx">old</span><span class="p">[</span><span class="nx">i</span><span class="p">]</span><span class="o">!=</span><span class="nx">value</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC149'>						<span class="nx">str</span> <span class="o">=</span> <span class="nx">str</span> <span class="o">+</span> <span class="nx">delimiter</span><span class="p">[</span><span class="nx">id</span><span class="p">]</span> <span class="o">+</span><span class="nx">old</span><span class="p">[</span><span class="nx">i</span><span class="p">];</span></div><div class='line' id='LC150'>					<span class="p">}</span></div><div class='line' id='LC151'>				<span class="p">}</span></div><div class='line' id='LC152'><br/></div><div class='line' id='LC153'>				<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">tagsInput</span><span class="p">.</span><span class="nx">importTags</span><span class="p">(</span><span class="k">this</span><span class="p">,</span><span class="nx">str</span><span class="p">);</span></div><div class='line' id='LC154'><br/></div><div class='line' id='LC155'>				<span class="k">if</span> <span class="p">(</span><span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">]</span> <span class="o">&amp;&amp;</span> <span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">][</span><span class="s1">&#39;onRemoveTag&#39;</span><span class="p">])</span> <span class="p">{</span></div><div class='line' id='LC156'>					<span class="kd">var</span> <span class="nx">f</span> <span class="o">=</span> <span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">][</span><span class="s1">&#39;onRemoveTag&#39;</span><span class="p">];</span></div><div class='line' id='LC157'>					<span class="nx">f</span><span class="p">.</span><span class="nx">call</span><span class="p">(</span><span class="k">this</span><span class="p">,</span> <span class="nx">value</span><span class="p">);</span></div><div class='line' id='LC158'>				<span class="p">}</span></div><div class='line' id='LC159'>			<span class="p">});</span></div><div class='line' id='LC160'><br/></div><div class='line' id='LC161'>			<span class="k">return</span> <span class="kc">false</span><span class="p">;</span></div><div class='line' id='LC162'>		<span class="p">};</span></div><div class='line' id='LC163'><br/></div><div class='line' id='LC164'>	<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">tagExist</span> <span class="o">=</span> <span class="kd">function</span><span class="p">(</span><span class="nx">val</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC165'>		<span class="kd">var</span> <span class="nx">id</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">);</span></div><div class='line' id='LC166'>		<span class="kd">var</span> <span class="nx">tagslist</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">val</span><span class="p">().</span><span class="nx">split</span><span class="p">(</span><span class="nx">delimiter</span><span class="p">[</span><span class="nx">id</span><span class="p">]);</span></div><div class='line' id='LC167'>		<span class="k">return</span> <span class="p">(</span><span class="nx">jQuery</span><span class="p">.</span><span class="nx">inArray</span><span class="p">(</span><span class="nx">val</span><span class="p">,</span> <span class="nx">tagslist</span><span class="p">)</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="p">);</span> <span class="c1">//true when tag exists, false when not</span></div><div class='line' id='LC168'>	<span class="p">};</span></div><div class='line' id='LC169'><br/></div><div class='line' id='LC170'>	<span class="c1">// clear all existing tags and import new ones from a string</span></div><div class='line' id='LC171'>	<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">importTags</span> <span class="o">=</span> <span class="kd">function</span><span class="p">(</span><span class="nx">str</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC172'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">id</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">);</span></div><div class='line' id='LC173'>		<span class="nx">$</span><span class="p">(</span><span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_tagsinput .tag&#39;</span><span class="p">).</span><span class="nx">remove</span><span class="p">();</span></div><div class='line' id='LC174'>		<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">tagsInput</span><span class="p">.</span><span class="nx">importTags</span><span class="p">(</span><span class="k">this</span><span class="p">,</span><span class="nx">str</span><span class="p">);</span></div><div class='line' id='LC175'>	<span class="p">}</span></div><div class='line' id='LC176'><br/></div><div class='line' id='LC177'>	<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">tagsInput</span> <span class="o">=</span> <span class="kd">function</span><span class="p">(</span><span class="nx">options</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC178'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">var</span> <span class="nx">settings</span> <span class="o">=</span> <span class="nx">jQuery</span><span class="p">.</span><span class="nx">extend</span><span class="p">({</span></div><div class='line' id='LC179'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">interactive</span><span class="o">:</span><span class="kc">true</span><span class="p">,</span></div><div class='line' id='LC180'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">defaultText</span><span class="o">:</span><span class="s1">&#39;add a tag&#39;</span><span class="p">,</span></div><div class='line' id='LC181'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">minChars</span><span class="o">:</span><span class="mi">0</span><span class="p">,</span></div><div class='line' id='LC182'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">width</span><span class="o">:</span><span class="s1">&#39;300px&#39;</span><span class="p">,</span></div><div class='line' id='LC183'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">height</span><span class="o">:</span><span class="s1">&#39;100px&#39;</span><span class="p">,</span></div><div class='line' id='LC184'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">autocomplete</span><span class="o">:</span> <span class="p">{</span><span class="nx">selectFirst</span><span class="o">:</span> <span class="kc">false</span> <span class="p">},</span></div><div class='line' id='LC185'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s1">&#39;hide&#39;</span><span class="o">:</span><span class="kc">true</span><span class="p">,</span></div><div class='line' id='LC186'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s1">&#39;delimiter&#39;</span><span class="o">:</span><span class="s1">&#39;,&#39;</span><span class="p">,</span></div><div class='line' id='LC187'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s1">&#39;unique&#39;</span><span class="o">:</span><span class="kc">true</span><span class="p">,</span></div><div class='line' id='LC188'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">removeWithBackspace</span><span class="o">:</span><span class="kc">true</span><span class="p">,</span></div><div class='line' id='LC189'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">placeholderColor</span><span class="o">:</span><span class="s1">&#39;#666666&#39;</span><span class="p">,</span></div><div class='line' id='LC190'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">autosize</span><span class="o">:</span> <span class="kc">true</span><span class="p">,</span></div><div class='line' id='LC191'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">comfortZone</span><span class="o">:</span> <span class="mi">20</span><span class="p">,</span></div><div class='line' id='LC192'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nx">inputPadding</span><span class="o">:</span> <span class="mi">6</span><span class="o">*</span><span class="mi">2</span></div><div class='line' id='LC193'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">},</span><span class="nx">options</span><span class="p">);</span></div><div class='line' id='LC194'><br/></div><div class='line' id='LC195'>		<span class="k">this</span><span class="p">.</span><span class="nx">each</span><span class="p">(</span><span class="kd">function</span><span class="p">()</span> <span class="p">{</span> </div><div class='line' id='LC196'>			<span class="k">if</span> <span class="p">(</span><span class="nx">settings</span><span class="p">.</span><span class="nx">hide</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC197'>				<span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">hide</span><span class="p">();</span>				</div><div class='line' id='LC198'>			<span class="p">}</span></div><div class='line' id='LC199'>			<span class="kd">var</span> <span class="nx">id</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">);</span></div><div class='line' id='LC200'>			<span class="k">if</span> <span class="p">(</span><span class="o">!</span><span class="nx">id</span> <span class="o">||</span> <span class="nx">delimiter</span><span class="p">[</span><span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">)])</span> <span class="p">{</span></div><div class='line' id='LC201'>				<span class="nx">id</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">,</span> <span class="s1">&#39;tags&#39;</span> <span class="o">+</span> <span class="k">new</span> <span class="nb">Date</span><span class="p">().</span><span class="nx">getTime</span><span class="p">()).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">);</span></div><div class='line' id='LC202'>			<span class="p">}</span></div><div class='line' id='LC203'><br/></div><div class='line' id='LC204'>			<span class="kd">var</span> <span class="nx">data</span> <span class="o">=</span> <span class="nx">jQuery</span><span class="p">.</span><span class="nx">extend</span><span class="p">({</span></div><div class='line' id='LC205'>				<span class="nx">pid</span><span class="o">:</span><span class="nx">id</span><span class="p">,</span></div><div class='line' id='LC206'>				<span class="nx">real_input</span><span class="o">:</span> <span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">id</span><span class="p">,</span></div><div class='line' id='LC207'>				<span class="nx">holder</span><span class="o">:</span> <span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_tagsinput&#39;</span><span class="p">,</span></div><div class='line' id='LC208'>				<span class="nx">input_wrapper</span><span class="o">:</span> <span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_addTag&#39;</span><span class="p">,</span></div><div class='line' id='LC209'>				<span class="nx">fake_input</span><span class="o">:</span> <span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_tag&#39;</span></div><div class='line' id='LC210'>			<span class="p">},</span><span class="nx">settings</span><span class="p">);</span></div><div class='line' id='LC211'><br/></div><div class='line' id='LC212'>			<span class="nx">delimiter</span><span class="p">[</span><span class="nx">id</span><span class="p">]</span> <span class="o">=</span> <span class="nx">data</span><span class="p">.</span><span class="nx">delimiter</span><span class="p">;</span></div><div class='line' id='LC213'><br/></div><div class='line' id='LC214'>			<span class="k">if</span> <span class="p">(</span><span class="nx">settings</span><span class="p">.</span><span class="nx">onAddTag</span> <span class="o">||</span> <span class="nx">settings</span><span class="p">.</span><span class="nx">onRemoveTag</span> <span class="o">||</span> <span class="nx">settings</span><span class="p">.</span><span class="nx">onChange</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC215'>				<span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">]</span> <span class="o">=</span> <span class="k">new</span> <span class="nb">Array</span><span class="p">();</span></div><div class='line' id='LC216'>				<span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">][</span><span class="s1">&#39;onAddTag&#39;</span><span class="p">]</span> <span class="o">=</span> <span class="nx">settings</span><span class="p">.</span><span class="nx">onAddTag</span><span class="p">;</span></div><div class='line' id='LC217'>				<span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">][</span><span class="s1">&#39;onRemoveTag&#39;</span><span class="p">]</span> <span class="o">=</span> <span class="nx">settings</span><span class="p">.</span><span class="nx">onRemoveTag</span><span class="p">;</span></div><div class='line' id='LC218'>				<span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">][</span><span class="s1">&#39;onChange&#39;</span><span class="p">]</span> <span class="o">=</span> <span class="nx">settings</span><span class="p">.</span><span class="nx">onChange</span><span class="p">;</span></div><div class='line' id='LC219'>			<span class="p">}</span></div><div class='line' id='LC220'><br/></div><div class='line' id='LC221'>			<span class="kd">var</span> <span class="nx">markup</span> <span class="o">=</span> <span class="s1">&#39;&lt;div id=&quot;&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_tagsinput&quot; class=&quot;tagsinput&quot;&gt;&lt;div id=&quot;&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_addTag&quot;&gt;&#39;</span><span class="p">;</span></div><div class='line' id='LC222'><br/></div><div class='line' id='LC223'>			<span class="k">if</span> <span class="p">(</span><span class="nx">settings</span><span class="p">.</span><span class="nx">interactive</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC224'>				<span class="nx">markup</span> <span class="o">=</span> <span class="nx">markup</span> <span class="o">+</span> <span class="s1">&#39;&lt;input id=&quot;&#39;</span><span class="o">+</span><span class="nx">id</span><span class="o">+</span><span class="s1">&#39;_tag&quot; value=&quot;&quot; data-default=&quot;&#39;</span><span class="o">+</span><span class="nx">settings</span><span class="p">.</span><span class="nx">defaultText</span><span class="o">+</span><span class="s1">&#39;&quot; /&gt;&#39;</span><span class="p">;</span></div><div class='line' id='LC225'>			<span class="p">}</span></div><div class='line' id='LC226'><br/></div><div class='line' id='LC227'>			<span class="nx">markup</span> <span class="o">=</span> <span class="nx">markup</span> <span class="o">+</span> <span class="s1">&#39;&lt;/div&gt;&lt;div class=&quot;tags_clear&quot;&gt;&lt;/div&gt;&lt;/div&gt;&#39;</span><span class="p">;</span></div><div class='line' id='LC228'><br/></div><div class='line' id='LC229'>			<span class="nx">$</span><span class="p">(</span><span class="nx">markup</span><span class="p">).</span><span class="nx">insertAfter</span><span class="p">(</span><span class="k">this</span><span class="p">);</span></div><div class='line' id='LC230'><br/></div><div class='line' id='LC231'>			<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">holder</span><span class="p">).</span><span class="nx">css</span><span class="p">(</span><span class="s1">&#39;width&#39;</span><span class="p">,</span><span class="nx">settings</span><span class="p">.</span><span class="nx">width</span><span class="p">);</span></div><div class='line' id='LC232'>			<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">holder</span><span class="p">).</span><span class="nx">css</span><span class="p">(</span><span class="s1">&#39;min-height&#39;</span><span class="p">,</span><span class="nx">settings</span><span class="p">.</span><span class="nx">height</span><span class="p">);</span></div><div class='line' id='LC233'>			<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">holder</span><span class="p">).</span><span class="nx">css</span><span class="p">(</span><span class="s1">&#39;height&#39;</span><span class="p">,</span><span class="s1">&#39;100%&#39;</span><span class="p">);</span></div><div class='line' id='LC234'><br/></div><div class='line' id='LC235'>			<span class="k">if</span> <span class="p">(</span><span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">real_input</span><span class="p">).</span><span class="nx">val</span><span class="p">()</span><span class="o">!=</span><span class="s1">&#39;&#39;</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC236'>				<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">tagsInput</span><span class="p">.</span><span class="nx">importTags</span><span class="p">(</span><span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">real_input</span><span class="p">),</span><span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">real_input</span><span class="p">).</span><span class="nx">val</span><span class="p">());</span></div><div class='line' id='LC237'>			<span class="p">}</span>		</div><div class='line' id='LC238'>			<span class="k">if</span> <span class="p">(</span><span class="nx">settings</span><span class="p">.</span><span class="nx">interactive</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC239'>				<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">(</span><span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;data-default&#39;</span><span class="p">));</span></div><div class='line' id='LC240'>				<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">css</span><span class="p">(</span><span class="s1">&#39;color&#39;</span><span class="p">,</span><span class="nx">settings</span><span class="p">.</span><span class="nx">placeholderColor</span><span class="p">);</span></div><div class='line' id='LC241'>		        <span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">resetAutosize</span><span class="p">(</span><span class="nx">settings</span><span class="p">);</span></div><div class='line' id='LC242'><br/></div><div class='line' id='LC243'>				<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">holder</span><span class="p">).</span><span class="nx">bind</span><span class="p">(</span><span class="s1">&#39;click&#39;</span><span class="p">,</span><span class="nx">data</span><span class="p">,</span><span class="kd">function</span><span class="p">(</span><span class="nx">event</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC244'>					<span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">focus</span><span class="p">();</span></div><div class='line' id='LC245'>				<span class="p">});</span></div><div class='line' id='LC246'><br/></div><div class='line' id='LC247'>				<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">bind</span><span class="p">(</span><span class="s1">&#39;focus&#39;</span><span class="p">,</span><span class="nx">data</span><span class="p">,</span><span class="kd">function</span><span class="p">(</span><span class="nx">event</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC248'>					<span class="k">if</span> <span class="p">(</span><span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">()</span><span class="o">==</span><span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;data-default&#39;</span><span class="p">))</span> <span class="p">{</span> </div><div class='line' id='LC249'>						<span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">(</span><span class="s1">&#39;&#39;</span><span class="p">);</span></div><div class='line' id='LC250'>					<span class="p">}</span></div><div class='line' id='LC251'>					<span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">css</span><span class="p">(</span><span class="s1">&#39;color&#39;</span><span class="p">,</span><span class="s1">&#39;#000000&#39;</span><span class="p">);</span>		</div><div class='line' id='LC252'>				<span class="p">});</span></div><div class='line' id='LC253'><br/></div><div class='line' id='LC254'>				<span class="k">if</span> <span class="p">(</span><span class="nx">settings</span><span class="p">.</span><span class="nx">autocomplete_url</span> <span class="o">!=</span> <span class="kc">undefined</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC255'>					<span class="nx">autocomplete_options</span> <span class="o">=</span> <span class="p">{</span><span class="nx">source</span><span class="o">:</span> <span class="nx">settings</span><span class="p">.</span><span class="nx">autocomplete_url</span><span class="p">};</span></div><div class='line' id='LC256'>					<span class="k">for</span> <span class="p">(</span><span class="nx">attrname</span> <span class="k">in</span> <span class="nx">settings</span><span class="p">.</span><span class="nx">autocomplete</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC257'>						<span class="nx">autocomplete_options</span><span class="p">[</span><span class="nx">attrname</span><span class="p">]</span> <span class="o">=</span> <span class="nx">settings</span><span class="p">.</span><span class="nx">autocomplete</span><span class="p">[</span><span class="nx">attrname</span><span class="p">];</span> </div><div class='line' id='LC258'>					<span class="p">}</span></div><div class='line' id='LC259'><br/></div><div class='line' id='LC260'>					<span class="k">if</span> <span class="p">(</span><span class="nx">jQuery</span><span class="p">.</span><span class="nx">Autocompleter</span> <span class="o">!==</span> <span class="kc">undefined</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC261'>						<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">autocomplete</span><span class="p">(</span><span class="nx">settings</span><span class="p">.</span><span class="nx">autocomplete_url</span><span class="p">,</span> <span class="nx">settings</span><span class="p">.</span><span class="nx">autocomplete</span><span class="p">);</span></div><div class='line' id='LC262'>						<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">bind</span><span class="p">(</span><span class="s1">&#39;result&#39;</span><span class="p">,</span><span class="nx">data</span><span class="p">,</span><span class="kd">function</span><span class="p">(</span><span class="nx">event</span><span class="p">,</span><span class="nx">data</span><span class="p">,</span><span class="nx">formatted</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC263'>							<span class="k">if</span> <span class="p">(</span><span class="nx">data</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC264'>								<span class="nx">$</span><span class="p">(</span><span class="s1">&#39;#&#39;</span><span class="o">+</span><span class="nx">id</span><span class="p">).</span><span class="nx">addTag</span><span class="p">(</span><span class="nx">data</span><span class="p">[</span><span class="mi">0</span><span class="p">]</span> <span class="o">+</span> <span class="s2">&quot;&quot;</span><span class="p">,{</span><span class="nx">focus</span><span class="o">:</span><span class="kc">true</span><span class="p">,</span><span class="nx">unique</span><span class="o">:</span><span class="p">(</span><span class="nx">settings</span><span class="p">.</span><span class="nx">unique</span><span class="p">)});</span></div><div class='line' id='LC265'>							<span class="p">}</span></div><div class='line' id='LC266'>					  	<span class="p">});</span></div><div class='line' id='LC267'>					<span class="p">}</span> <span class="k">else</span> <span class="k">if</span> <span class="p">(</span><span class="nx">jQuery</span><span class="p">.</span><span class="nx">ui</span><span class="p">.</span><span class="nx">autocomplete</span> <span class="o">!==</span> <span class="kc">undefined</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC268'>						<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">autocomplete</span><span class="p">(</span><span class="nx">autocomplete_options</span><span class="p">);</span></div><div class='line' id='LC269'>						<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">bind</span><span class="p">(</span><span class="s1">&#39;autocompleteselect&#39;</span><span class="p">,</span><span class="nx">data</span><span class="p">,</span><span class="kd">function</span><span class="p">(</span><span class="nx">event</span><span class="p">,</span><span class="nx">ui</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC270'>							<span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">real_input</span><span class="p">).</span><span class="nx">addTag</span><span class="p">(</span><span class="nx">ui</span><span class="p">.</span><span class="nx">item</span><span class="p">.</span><span class="nx">value</span><span class="p">,{</span><span class="nx">focus</span><span class="o">:</span><span class="kc">true</span><span class="p">,</span><span class="nx">unique</span><span class="o">:</span><span class="p">(</span><span class="nx">settings</span><span class="p">.</span><span class="nx">unique</span><span class="p">)});</span></div><div class='line' id='LC271'>							<span class="k">return</span> <span class="kc">false</span><span class="p">;</span></div><div class='line' id='LC272'>						<span class="p">});</span></div><div class='line' id='LC273'>					<span class="p">}</span></div><div class='line' id='LC274'><br/></div><div class='line' id='LC275'><br/></div><div class='line' id='LC276'>				<span class="p">}</span> <span class="k">else</span> <span class="p">{</span></div><div class='line' id='LC277'>						<span class="c1">// if a user tabs out of the field, create a new tag</span></div><div class='line' id='LC278'>						<span class="c1">// this is only available if autocomplete is not used.</span></div><div class='line' id='LC279'>						<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">bind</span><span class="p">(</span><span class="s1">&#39;blur&#39;</span><span class="p">,</span><span class="nx">data</span><span class="p">,</span><span class="kd">function</span><span class="p">(</span><span class="nx">event</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC280'>							<span class="kd">var</span> <span class="nx">d</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;data-default&#39;</span><span class="p">);</span></div><div class='line' id='LC281'>							<span class="k">if</span> <span class="p">(</span><span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">()</span><span class="o">!=</span><span class="s1">&#39;&#39;</span> <span class="o">&amp;&amp;</span> <span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">()</span><span class="o">!=</span><span class="nx">d</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC282'>								<span class="k">if</span><span class="p">(</span> <span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">minChars</span> <span class="o">&lt;=</span> <span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">().</span><span class="nx">length</span><span class="p">)</span> <span class="o">&amp;&amp;</span> <span class="p">(</span><span class="o">!</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">maxChars</span> <span class="o">||</span> <span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">maxChars</span> <span class="o">&gt;=</span> <span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">().</span><span class="nx">length</span><span class="p">))</span> <span class="p">)</span></div><div class='line' id='LC283'>									<span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">real_input</span><span class="p">).</span><span class="nx">addTag</span><span class="p">(</span><span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">(),{</span><span class="nx">focus</span><span class="o">:</span><span class="kc">true</span><span class="p">,</span><span class="nx">unique</span><span class="o">:</span><span class="p">(</span><span class="nx">settings</span><span class="p">.</span><span class="nx">unique</span><span class="p">)});</span></div><div class='line' id='LC284'>							<span class="p">}</span> <span class="k">else</span> <span class="p">{</span></div><div class='line' id='LC285'>								<span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">(</span><span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;data-default&#39;</span><span class="p">));</span></div><div class='line' id='LC286'>								<span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">css</span><span class="p">(</span><span class="s1">&#39;color&#39;</span><span class="p">,</span><span class="nx">settings</span><span class="p">.</span><span class="nx">placeholderColor</span><span class="p">);</span></div><div class='line' id='LC287'>							<span class="p">}</span></div><div class='line' id='LC288'>							<span class="k">return</span> <span class="kc">false</span><span class="p">;</span></div><div class='line' id='LC289'>						<span class="p">});</span></div><div class='line' id='LC290'><br/></div><div class='line' id='LC291'>				<span class="p">}</span></div><div class='line' id='LC292'>				<span class="c1">// if user types a comma, create a new tag</span></div><div class='line' id='LC293'>				<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">bind</span><span class="p">(</span><span class="s1">&#39;keypress&#39;</span><span class="p">,</span><span class="nx">data</span><span class="p">,</span><span class="kd">function</span><span class="p">(</span><span class="nx">event</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC294'>					<span class="k">if</span> <span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">which</span><span class="o">==</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">delimiter</span><span class="p">.</span><span class="nx">charCodeAt</span><span class="p">(</span><span class="mi">0</span><span class="p">)</span> <span class="o">||</span> <span class="nx">event</span><span class="p">.</span><span class="nx">which</span><span class="o">==</span><span class="mi">13</span> <span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC295'>					    <span class="nx">event</span><span class="p">.</span><span class="nx">preventDefault</span><span class="p">();</span></div><div class='line' id='LC296'>						<span class="k">if</span><span class="p">(</span> <span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">minChars</span> <span class="o">&lt;=</span> <span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">().</span><span class="nx">length</span><span class="p">)</span> <span class="o">&amp;&amp;</span> <span class="p">(</span><span class="o">!</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">maxChars</span> <span class="o">||</span> <span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">maxChars</span> <span class="o">&gt;=</span> <span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">().</span><span class="nx">length</span><span class="p">))</span> <span class="p">)</span></div><div class='line' id='LC297'>							<span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">real_input</span><span class="p">).</span><span class="nx">addTag</span><span class="p">(</span><span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">val</span><span class="p">(),{</span><span class="nx">focus</span><span class="o">:</span><span class="kc">true</span><span class="p">,</span><span class="nx">unique</span><span class="o">:</span><span class="p">(</span><span class="nx">settings</span><span class="p">.</span><span class="nx">unique</span><span class="p">)});</span></div><div class='line' id='LC298'>					  	<span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">resetAutosize</span><span class="p">(</span><span class="nx">settings</span><span class="p">);</span></div><div class='line' id='LC299'>						<span class="k">return</span> <span class="kc">false</span><span class="p">;</span></div><div class='line' id='LC300'>					<span class="p">}</span> <span class="k">else</span> <span class="k">if</span> <span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">autosize</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC301'>			            <span class="nx">$</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">doAutosize</span><span class="p">(</span><span class="nx">settings</span><span class="p">);</span></div><div class='line' id='LC302'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC303'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;			<span class="p">}</span></div><div class='line' id='LC304'>				<span class="p">});</span></div><div class='line' id='LC305'>				<span class="c1">//Delete last tag on backspace</span></div><div class='line' id='LC306'>				<span class="nx">data</span><span class="p">.</span><span class="nx">removeWithBackspace</span> <span class="o">&amp;&amp;</span> <span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">bind</span><span class="p">(</span><span class="s1">&#39;keydown&#39;</span><span class="p">,</span> <span class="kd">function</span><span class="p">(</span><span class="nx">event</span><span class="p">)</span></div><div class='line' id='LC307'>				<span class="p">{</span></div><div class='line' id='LC308'>					<span class="k">if</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">keyCode</span> <span class="o">==</span> <span class="mi">8</span> <span class="o">&amp;&amp;</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">val</span><span class="p">()</span> <span class="o">==</span> <span class="s1">&#39;&#39;</span><span class="p">)</span></div><div class='line' id='LC309'>					<span class="p">{</span></div><div class='line' id='LC310'>						 <span class="nx">event</span><span class="p">.</span><span class="nx">preventDefault</span><span class="p">();</span></div><div class='line' id='LC311'>						 <span class="kd">var</span> <span class="nx">last_tag</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">closest</span><span class="p">(</span><span class="s1">&#39;.tagsinput&#39;</span><span class="p">).</span><span class="nx">find</span><span class="p">(</span><span class="s1">&#39;.tag:last&#39;</span><span class="p">).</span><span class="nx">text</span><span class="p">();</span></div><div class='line' id='LC312'>						 <span class="kd">var</span> <span class="nx">id</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">).</span><span class="nx">replace</span><span class="p">(</span><span class="sr">/_tag$/</span><span class="p">,</span> <span class="s1">&#39;&#39;</span><span class="p">);</span></div><div class='line' id='LC313'>						 <span class="nx">last_tag</span> <span class="o">=</span> <span class="nx">last_tag</span><span class="p">.</span><span class="nx">replace</span><span class="p">(</span><span class="sr">/[\s]+x$/</span><span class="p">,</span> <span class="s1">&#39;&#39;</span><span class="p">);</span></div><div class='line' id='LC314'>						 <span class="nx">$</span><span class="p">(</span><span class="s1">&#39;#&#39;</span> <span class="o">+</span> <span class="nx">id</span><span class="p">).</span><span class="nx">removeTag</span><span class="p">(</span><span class="nx">escape</span><span class="p">(</span><span class="nx">last_tag</span><span class="p">));</span></div><div class='line' id='LC315'>						 <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">trigger</span><span class="p">(</span><span class="s1">&#39;focus&#39;</span><span class="p">);</span></div><div class='line' id='LC316'>					<span class="p">}</span></div><div class='line' id='LC317'>				<span class="p">});</span></div><div class='line' id='LC318'>				<span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">blur</span><span class="p">();</span></div><div class='line' id='LC319'><br/></div><div class='line' id='LC320'>				<span class="c1">//Removes the not_valid class when user changes the value of the fake input</span></div><div class='line' id='LC321'>				<span class="k">if</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">unique</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC322'>				    <span class="nx">$</span><span class="p">(</span><span class="nx">data</span><span class="p">.</span><span class="nx">fake_input</span><span class="p">).</span><span class="nx">keydown</span><span class="p">(</span><span class="kd">function</span><span class="p">(</span><span class="nx">event</span><span class="p">){</span></div><div class='line' id='LC323'>				        <span class="k">if</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">keyCode</span> <span class="o">==</span> <span class="mi">8</span> <span class="o">||</span> <span class="nb">String</span><span class="p">.</span><span class="nx">fromCharCode</span><span class="p">(</span><span class="nx">event</span><span class="p">.</span><span class="nx">which</span><span class="p">).</span><span class="nx">match</span><span class="p">(</span><span class="sr">/\w+|[áéíóúÁÉÍÓÚñÑ,/]+/</span><span class="p">))</span> <span class="p">{</span></div><div class='line' id='LC324'>				            <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">).</span><span class="nx">removeClass</span><span class="p">(</span><span class="s1">&#39;not_valid&#39;</span><span class="p">);</span></div><div class='line' id='LC325'>				        <span class="p">}</span></div><div class='line' id='LC326'>				    <span class="p">});</span></div><div class='line' id='LC327'>				<span class="p">}</span></div><div class='line' id='LC328'>			<span class="p">}</span> <span class="c1">// if settings.interactive</span></div><div class='line' id='LC329'>		<span class="p">});</span></div><div class='line' id='LC330'><br/></div><div class='line' id='LC331'>		<span class="k">return</span> <span class="k">this</span><span class="p">;</span></div><div class='line' id='LC332'><br/></div><div class='line' id='LC333'>	<span class="p">};</span></div><div class='line' id='LC334'><br/></div><div class='line' id='LC335'>	<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">tagsInput</span><span class="p">.</span><span class="nx">updateTagsField</span> <span class="o">=</span> <span class="kd">function</span><span class="p">(</span><span class="nx">obj</span><span class="p">,</span><span class="nx">tagslist</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC336'>		<span class="kd">var</span> <span class="nx">id</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="nx">obj</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">);</span></div><div class='line' id='LC337'>		<span class="nx">$</span><span class="p">(</span><span class="nx">obj</span><span class="p">).</span><span class="nx">val</span><span class="p">(</span><span class="nx">tagslist</span><span class="p">.</span><span class="nx">join</span><span class="p">(</span><span class="nx">delimiter</span><span class="p">[</span><span class="nx">id</span><span class="p">]));</span></div><div class='line' id='LC338'>	<span class="p">};</span></div><div class='line' id='LC339'><br/></div><div class='line' id='LC340'>	<span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">tagsInput</span><span class="p">.</span><span class="nx">importTags</span> <span class="o">=</span> <span class="kd">function</span><span class="p">(</span><span class="nx">obj</span><span class="p">,</span><span class="nx">val</span><span class="p">)</span> <span class="p">{</span>			</div><div class='line' id='LC341'>		<span class="nx">$</span><span class="p">(</span><span class="nx">obj</span><span class="p">).</span><span class="nx">val</span><span class="p">(</span><span class="s1">&#39;&#39;</span><span class="p">);</span></div><div class='line' id='LC342'>		<span class="kd">var</span> <span class="nx">id</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="nx">obj</span><span class="p">).</span><span class="nx">attr</span><span class="p">(</span><span class="s1">&#39;id&#39;</span><span class="p">);</span></div><div class='line' id='LC343'>		<span class="kd">var</span> <span class="nx">tags</span> <span class="o">=</span> <span class="nx">val</span><span class="p">.</span><span class="nx">split</span><span class="p">(</span><span class="nx">delimiter</span><span class="p">[</span><span class="nx">id</span><span class="p">]);</span></div><div class='line' id='LC344'>		<span class="k">for</span> <span class="p">(</span><span class="nx">i</span><span class="o">=</span><span class="mi">0</span><span class="p">;</span> <span class="nx">i</span><span class="o">&lt;</span><span class="nx">tags</span><span class="p">.</span><span class="nx">length</span><span class="p">;</span> <span class="nx">i</span><span class="o">++</span><span class="p">)</span> <span class="p">{</span> </div><div class='line' id='LC345'>			<span class="nx">$</span><span class="p">(</span><span class="nx">obj</span><span class="p">).</span><span class="nx">addTag</span><span class="p">(</span><span class="nx">tags</span><span class="p">[</span><span class="nx">i</span><span class="p">],{</span><span class="nx">focus</span><span class="o">:</span><span class="kc">false</span><span class="p">,</span><span class="nx">callback</span><span class="o">:</span><span class="kc">false</span><span class="p">});</span></div><div class='line' id='LC346'>		<span class="p">}</span></div><div class='line' id='LC347'>		<span class="k">if</span><span class="p">(</span><span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">]</span> <span class="o">&amp;&amp;</span> <span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">][</span><span class="s1">&#39;onChange&#39;</span><span class="p">])</span></div><div class='line' id='LC348'>		<span class="p">{</span></div><div class='line' id='LC349'>			<span class="kd">var</span> <span class="nx">f</span> <span class="o">=</span> <span class="nx">tags_callbacks</span><span class="p">[</span><span class="nx">id</span><span class="p">][</span><span class="s1">&#39;onChange&#39;</span><span class="p">];</span></div><div class='line' id='LC350'>			<span class="nx">f</span><span class="p">.</span><span class="nx">call</span><span class="p">(</span><span class="nx">obj</span><span class="p">,</span> <span class="nx">obj</span><span class="p">,</span> <span class="nx">tags</span><span class="p">[</span><span class="nx">i</span><span class="p">]);</span></div><div class='line' id='LC351'>		<span class="p">}</span></div><div class='line' id='LC352'>	<span class="p">};</span></div><div class='line' id='LC353'><br/></div><div class='line' id='LC354'><span class="p">})(</span><span class="nx">jQuery</span><span class="p">);</span></div></pre></div></td>
          </tr>
        </table>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.02774s from github-fe138-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close js-ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

  </body>
</html>

