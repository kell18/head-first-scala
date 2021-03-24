## Chats (beginner friendly)
1. Gitter [rooms](https://gitter.im/scala/scala)
2. Telegram [scala_en](https://t.me/scala_en) and [scala_ru](https://t.me/scala_ru)

## Introductory talks and articles
- Nice and short [intro to Scala](https://www.youtube.com/watch?v=30q6BkBv5MY) by Adam Warski
- Great [intro to FP on Scala](https://www.youtube.com/watch?v=30q6BkBv5MY) by Rob Norris

## Courses
- [Series of courses from the lang creators](https://www.coursera.org/specializations/scala) - first one quite tedious, second and next are much better
- [Rock the JVM on Udemy](https://www.udemy.com/course/advanced-scala/) and the [basic one](https://www.udemy.com/course/rock-the-jvm-scala-for-beginners/) - I didn't try it, but seems good at a glance

## Books
- Begginer:
    - [Programming in Scala](https://booksites.artima.com/programming_in_scala_3ed)
    - [Creative Scala](https://underscore.io/books/creative-scala/) (free!) - fresh and focuses more on FP
    - [Essential Scala](https://underscore.io/training/courses/essential-scala/) (free!) - a bit older but still very good
- Advanced:
    - The best one for FP and Cats ecosystem - [Scala with Cats](https://underscore.io/books/scala-with-cats/)
    - Famous book-exercise - [Functional Programming in Scala](https://www.amazon.com/Functional-Programming-Scala-Paul-Chiusano/dp/1617290653) (aka the Red book aka the book-exercise)

## Articles and more
- [Errors handling strategy](https://stackoverflow.com/a/35736191/2453144) in functional Scala  
- Monads explanations:
    - [Monads in Scala](https://medium.com/@sinisalouc/demystifying-the-monad-in-scala-cc716bb6f534)
    - Good [explanation](https://habrahabr.ru/post/183150/) in general (Russian)
- [Scala best practices I wish someone'd told me about](https://www.youtube.com/watch?v=DGa58FfiMqc) - Nicolas Rinaudo and the related list of [best practices](https://nrinaudo.github.io/scala-best-practices/)
- Nice [intro to Cats-Effect](https://www.youtube.com/watch?v=83pXEdCpY4A)
- [Scala-exercises](https://www.scala-exercises.org/) (turn off ad-block first)
- [Awesome Scala](https://github.com/lauris/awesome-scala) - list of libs and frameworks
- [Official tutorial and docs are not that bad as well](https://docs.scala-lang.org/tour/basics.html)

## General recommendations
- Environment: Intellij with Scala plugin are quite nice. VS Code with Metals plugin super as well. Eclipse Scala IDE seems a bit outdated to me.
- Be patient, don't expect that you'll know everything after one book or course, Scala is a scale, you'll have something to learn for some time. ;)  
- Experienced buddy in Scala or any other functional language could help you a lot, or you can ask any questions in Scala gitter channels as well.
- Don't be lured by Akka Actors marketing. It is too powerful tool and hence hardly composable and extendable. Try to use simpler technologies if you have complex concurrency case (eg IO/Monix). Also Akka contradicts some of the functional programming aspects Scala trying to bring (local-reasoning, referential transparency, etc).

## Some terminology
- FP - a way of writing programs so it's very composable and easy to reason about by omitting mutable state, side effects (eg. blocking threads, throwing exceptions, etc), non-local reasoning (dependency injection, actors, runtime class loading, reflection)
- Cats - enhancement of standard lib for basic FP
- Cats.effect - furthermore provides a way to write programs without side-effects (IO type) and concurrently
- Tofu - alternative to Cats.effect
- ZIO - also alternative to Cats.effect but with quite different approach
- Akka - Actors library
- Read on [A Glossary of Functional Programming](https://degoes.net/articles/fp-glossary) by John De Goes

## Jobs
- [Functional Works](https://functional.works-hub.com/)
- [Signify Technology](https://www.signifytechnology.com/)
- [Stackoverflow Jobs](https://stackoverflow.com/jobs?tl=scala)

## Podcasts
1. [CoRecursive w/ Adam Bell](https://corecursive.com/) - for me the [episode#004](https://corecursive.com/004-design-principles-from-functional-programming-with-runar-bjarnason/) with Runar Bjarnason was eye-opening in terms of FP and functinal design
2. [Scala Love](https://scala.love/)
3. [Scalalaz](https://scalalaz.ru) (Russian)
4. [Soft Skills Engineering](https://softskills.audio/), [Software Engineering Radio](https://www.se-radio.net/) - not directly related but still cool

## News
1. [Scalatimes](http://scalatimes.com/) - super useful, sign up to stay tuned
