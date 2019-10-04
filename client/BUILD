node_module(
  name="client",
  sources=globs('package.json', 'webpack.config.js', '.babelrc', 'src/*', 'public/*', 'yarn.lock', '.eslintrc.js'),
  build_script="build",
  package_manager="yarn",
)

node_module(
  name="client-start",
  sources=globs('package.json', 'webpack.config.js', '.babelrc', 'src/*', 'public/*', 'yarn.lock', '.eslintrc.js'),
  build_script="start",
  package_manager="yarn",
)

node_module(
  name="client-lint",
  sources=globs('package.json', 'webpack.config.js', '.babelrc', 'src/*', 'public/*', 'yarn.lock', '.eslintrc.js'),
  build_script="lint",
  package_manager="yarn",
)

node_module(
  name="client-fmt",
  sources=globs('package.json', 'webpack.config.js', '.babelrc', 'src/*', 'public/*', 'yarn.lock', '.eslintrc.js'),
  build_script="format",
  package_manager="yarn",
)

node_bundle(
    name="client-bundle",
    node_module=":client",
)

node_test(
  name="client-test",
  dependencies=[
    ":client"
  ]
)
