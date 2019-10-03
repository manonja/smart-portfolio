# Building
To support JavaScript and Scala in the same repo we leverage the [pants build](https://www.pantsbuild.org) system. 
To work on mac make sure to run `ulimit -n 10000` first.

## Server
Pants integrates well with scala. You can develop the server as follows,

- compile, `./pants compile ./server:smartportfolio-server`
- run, `./pants run ./server:smartportfolio-server`
- lint, `./pants lint ./server:smartportfolio-server`
- format, `./pants fmt ./server:smartportfolio-server`

If you prefer you can also still use `sbt`.

## Client
Pants integrates with yarn. You can run the development server as follows,

- run development mode, `./pants run client:client-start`
- bundle, `./pants run client:client`
- lint, `./pants run client:client-lint`
- format, `./pants run client:client-fmt`

If you prefer you can also still use `yarn`.
