# agrest-bookstore-example

[![Build Status](https://travis-ci.org/agrestio/agrest-bookstore-example.svg?branch=master)](https://travis-ci.org/agrestio/agrest-bookstore-example)

A simple example of an [AgRest](http://agrest.io) / [Apache Cayenne](http://cayenne.apache.org/) application.

## Prerequisites:

* Java 1.8 or newer.
* Apache Maven.

## Run

```
mvn jetty:run
```

Now you can navigate to http://127.0.0.1:8080/api/category 

## Sample Operations

```
curl -i -X POST 'http://127.0.0.1:8080/api/category' \
         -d '{"name":"SciFi","description":"Science Fiction Books"}'
         
curl -i -X GET 'http://127.0.0.1:8080/link-rest-cms-demo/domain'
```
