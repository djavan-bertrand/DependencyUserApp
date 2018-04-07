# Dependency User App

This app depends on a lib called `Dependency` and from a lib called `DependencyUserLib`.
The lib `DependencyUserLib` depends itself on `Dependency`.

`DependencyUserLib` version 1.0.0 depends on the version 1.0.0 of `Dependency`.
`DependencyUserLib` version 2.0.0 depends on the version 2.0.0 of `Dependency`.

The lib  `Dependency` introduced an API compatibility break between its version 1.0.0 and 2.0.0.

This example shows that if app uses `Dependency` in version 1.0.0 and `DependencyUserLib` in version 2.0.0,
it behaves correctly since it will actually use `Dependency` in version 2.0.0 (greatest version is always used by gradle).

Indeed, since gradle knows that it will use version 2.0.0 you can't use in the app the function of the 1.0.0
that have been modified in the 2.0.0.

However if app uses `Dependency` in version 2.0.0 and `DependencyUserLib` in version 1.0.0, it might crash if
`DependencyUserLib` is using one of the function that have been modified in the version 2.0.0.

This experiment shows that:

- API compatibility breaks should be prohibited when releasing a library
- Apps using libraries that have a common dependency with the app itself should target the same version of this library or a
  lower version.

This experiment will be used for a talk about writing an SDK or a library.
  
Links to this talk will be posted here as soon as they are available.
