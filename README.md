# weather

A Clojure library designed to get weather reports given a zipcode

### Building

```
$ lein uberjar
```

### Running

To view weather for a specific zipcode enter:

```
$ java -jar target/weather.jar ZIPCODE
```

For example, to get the weather for New York city.

```
$ java -jar target/weather.jar 10001
```

Which as of this writing returns the following:

```
Zipcode  : 10001
Current  : Partly Cloudy
Soon     : Mostly cloudy starting this afternoon.
Later    : Rain tomorrow and Saturday, with temperatures falling to 78°F on Tuesday.
```



## License

Copyright © 2017 Brad Lucas

