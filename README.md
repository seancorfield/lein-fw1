# lein-fw1

A [leiningen](https://github.com/technomancy/leiningen) plugin to help
create and manage [FW/1](https://github.com/seancorfield/fw1-clj)
projects.

**This has been deprecated in favor of
 [fw1-template](https://github.com/seancorfield/fw1-template) which is
 a template for use with
 [lein-newnew](https://github.com/Raynes/lein-newnew) which will
 become the default 'new' task in Leiningen 2.0.**

## Usage

```bash
lein plugin install lein-fw 0.0.6
lein fw1 new my-website
```

Currently the only supported operation is new, but more will be coming to help deploy and manage projects.

## Acknowledgements

Shamelessly copied from Chris Grainger's [lein-noir](https://github.com/ibdknox/lein-noir) plugin, with permission. Thanx Chris!

## License

Copyright (C) 2011-2012 Sean Corfield

Distributed under the Eclipse Public License, the same as Clojure.
