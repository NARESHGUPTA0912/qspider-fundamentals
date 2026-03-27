

# Types of JavaScript
1. Internal JS      2. External JS

# D/f b/w async & defer

1. async: downloads the script in parallel with HTML parsing but executes immediately when ready (pausing HTML parsing), with no guarsnteed execution order between multiple async scripts.

2. defer: Downloads the scripts in parallel HTML parsing, but executes only after HTML parsing completes, maintaining the original order of the scripts in the document.

3. Use Case : Use async for independent scripts (analytics, ads) and defer for scripts that depend on the DOM or each other.