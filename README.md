# Mill Scala 2 compile error colors

This demonstrates an issue with Mill and Scala 2 compile errors that have colored text -- Mill does not render the colors.

To reproduce:

- Clone this repo
- `cd` into it
- Run `sbt compile` to see that sbt renders colors in the compile error
- Run `./mill __.compile` to see that Mill does not render colors in the compile error

![sbt-vs-mill](https://github.com/mrdziuban/mill-compile-error-colors/assets/4718399/bddb8157-147c-45ff-a1ea-d36340ed2169)
