## Chats
1. Gitter [rooms](https://gitter.im/scala/scala) - beginner friendly
2. [scala_ru](https://t.me/scala_ru)

## Some resources
- [Series of courses from the lang creators](https://www.coursera.org/specializations/scala), first one quite tedious, second and next are much better, but you need some basic knowledge to that, a good book could be a great start
- _Books_
    - Begginer:
        - [Programming in Scala](https://booksites.artima.com/programming_in_scala_3ed)
        - [Essential Scala](https://underscore.io/training/courses/essential-scala/) (free)
    - Advanced:
        - The best one - [Scala with Cats](https://underscore.io/books/scala-with-cats/)
        - Famous book-exercise - [Functional Programming in Scala](https://www.amazon.com/Functional-Programming-Scala-Paul-Chiusano/dp/1617290653) (aka the Red book)
- Great talk, beginner friendly [into to FP on Scala](https://www.youtube.com/watch?v=30q6BkBv5MY) by Rob Norris 
    - Also a [nice one](https://www.youtube.com/watch?v=83pXEdCpY4A) and more advanced
- [Errors handling strategy](https://stackoverflow.com/a/35736191/2453144) in functional Scala
- Monads explanations:
    - Good [explanation](https://habrahabr.ru/post/183150/) in general
    - [Monads in Scala](https://medium.com/@sinisalouc/demystifying-the-monad-in-scala-cc716bb6f534)

- [Scala-exercises](https://www.scala-exercises.org/) (turn off ad-block first)
- Couple of great lists of the best practices: [first](https://github.com/alexandru/scala-best-practices) and [second](https://nrinaudo.github.io/scala-best-practices/) - keep an eye on it, there are some decent expalations for "Why?" questions as well
- [Awesome Scala](https://github.com/lauris/awesome-scala) - list of libs and frameworks
- Intresting, alternative [roadmap](https://gist.github.com/d1egoaz/2180cbbf7d373a0c5575f9a62466e5e1)
- [More](https://scala-lang.org/documentation/learn.html)

## News
1. [Scalatimes](http://scalatimes.com/) - super-useful, sign up to stay tuned

## Podcasts
1. [CoRecursive w/ Adam Bell](https://corecursive.com/)
2. [Scala Love](https://scala.love/)
3. [Scalalaz](https://scalalaz.ru) (Rus)
4. [Soft Skills Engineering](https://softskills.audio/), [Software Engineering Radio](https://www.se-radio.net/) - not directly related but still cool

## General recommendations
- Environment: Intellij with Scala plugin are quite nice. VS Code with Metals plugin super as well. Eclipse Scala IDE seems a bit outdated to me.
- Be patient, don't expect that you'll know everything after one book or course, Scala is a scale, you'll have something to learn for some time. ;)  
- Experienced buddy in Scala or any other functional language could help you a lot, or you can ask any questions in Scala gitter channels as well.
- Don't be lured by Akka Actors marketing. It is too powerful tool and hence hardly composable and extendable. Try to use simpler technologies if you have complex concurrency case (eg Monix). Also Akka contradicts some of the functional programming aspects Scala trying to bring, so it's not so good for your Scala level.
