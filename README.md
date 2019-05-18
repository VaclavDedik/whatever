# Whatever

Library that lets you write your code without worrying about consequences!

Have you ever wanted to add some code to your project that you do not care much about? Be it for testing, debugging, or maybe you are just lazy and unwilling to test some piece of code, **would it not be nice if you could do all of those in a safe manner?**

Look no further, this library allows you to do exactly that.

## Motivation

Sometimes, some developers (or at least me) want to add some code somewhere (usually just temporary code that will be deleted later) that is either completely untested (e.g. due to laziness, or just because it does not seem necessary) or partially untested. This code could, however, brake something even though the developer does not realize it, e.g. if it contains some kind of bug that only manifests itself at runtime. The solution is to write the code in a way that prevents any potential exception from being thrown and disrupting the original execution of the application

Why not just to use `try...catch` block? Two main reasons -- It's verbose and cumbersome; and it is less expressive - i.e. if you see a try-catch block, it does not occur to you that such code was written because the developer did not with to broke some existing code with it. On the other hand, this library would help you immediately see when such code is written (and that it can be potentially removed). 

Third, less important reason, is that this library can be improved and extend with some fun and creative ideas!

## Installation and Usage

Installation with Maven:

```
<dependency>
    <groupId>com.vaclavdedik</groupId>
    <artifactId>whatever</artifactId>
    <version>1.0.0</version>
</dependency>
```

Usage in code:

```

import static whatever.Whatever.whatever;

...

whatever(() -> {
    int x = 5;
    int y = 0;
    
    // broken code, throws exception, but whatever!
    System.out.println(x / y);
});

```


