# BugReportRepro
Helping to solve a bug on Microsoft Playwright.


Playwright not compatible with JavaFX.

ENVIROMENT:
- OpenJDK 18.0.1
- Graddle
- Dependencies: https://imgur.com/a/KA7r3cC

ERRORS: 

See https://docs.gradle.org/7.4/userguide/command_line_interface.html#sec:command_line_warnings
1 actionable task: 1 executed
error: the unnamed module reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: the unnamed module reads package com.microsoft.playwright.impl from both playwright and driver
error: module javafx.graphicsEmpty reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: module javafx.graphicsEmpty reads package com.microsoft.playwright.impl from both playwright and driver
error: module javafx.baseEmpty reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: module javafx.baseEmpty reads package com.microsoft.playwright.impl from both playwright and driver
error: module driver.bundle reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: module driver.bundle reads package com.microsoft.playwright.impl from both playwright and driver
error: module driver reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: module driver reads package com.microsoft.playwright.impl from both playwright and driver
error: module javafx.controlsEmpty reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: module javafx.controlsEmpty reads package com.microsoft.playwright.impl from both playwright and driver
error: module playwright reads package com.microsoft.playwright.impl from both driver.bundle and playwright
error: module playwright reads package com.microsoft.playwright.impl from both driver.bundle and driver
C:\Users\nicol\Desktop\New projects\BugReportRepro\src\main\java\module-info.java:1: error: module BugReportRepro.main reads package com.microsoft.playwright.impl from both playwright and driver.bundle
module BugReportRepro.main {
^
15 errors

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileJava'.
> Compilation failed; see the compiler error output for details.

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 8s
08:25:43: Execution finished ':Main.main()'.


> Task :compileJava FAILED
error: the unnamed module reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: the unnamed module reads package com.microsoft.playwright.impl from both playwright and driver
error: module javafx.graphicsEmpty reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: module javafx.graphicsEmpty reads package com.microsoft.playwright.impl from both playwright and driver
error: module javafx.baseEmpty reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: module javafx.baseEmpty reads package com.microsoft.playwright.impl from both playwright and driver
the unnamed module reads package com.microsoft.playwright.impl from both playwright and driver.bundle

error: module driver.bundle reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: module driver.bundle reads package com.microsoft.playwright.impl from both playwright and driver
error: module driver reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: module driver reads package com.microsoft.playwright.impl from both playwright and driver
error: module javafx.controlsEmpty reads package com.microsoft.playwright.impl from both playwright and driver.bundle
error: module javafx.controlsEmpty reads package com.microsoft.playwright.impl from both playwright and driver
error: module playwright reads package com.microsoft.playwright.impl from both driver.bundle and playwright
error: module playwright reads package com.microsoft.playwright.impl from both driver.bundle and driver
C:\Users\nicol\Desktop\New projects\BugReportRepro\src\main\java\module-info.java:1: error: module BugReportRepro.main reads package com.microsoft.playwright.impl from both playwright and driver.bundle
module BugReportRepro.main {
^
15 errors

the unnamed module reads package com.microsoft.playwright.impl from both playwright and driver

module javafx.graphicsEmpty reads package com.microsoft.playwright.impl from both playwright and driver.bundle

module javafx.graphicsEmpty reads package com.microsoft.playwright.impl from both playwright and driver

module javafx.baseEmpty reads package com.microsoft.playwright.impl from both playwright and driver.bundle

module javafx.baseEmpty reads package com.microsoft.playwright.impl from both playwright and driver

module driver.bundle reads package com.microsoft.playwright.impl from both playwright and driver.bundle

module driver.bundle reads package com.microsoft.playwright.impl from both playwright and driver

module driver reads package com.microsoft.playwright.impl from both playwright and driver.bundle

module driver reads package com.microsoft.playwright.impl from both playwright and driver

module javafx.controlsEmpty reads package com.microsoft.playwright.impl from both playwright and driver.bundle

module javafx.controlsEmpty reads package com.microsoft.playwright.impl from both playwright and driver

module playwright reads package com.microsoft.playwright.impl from both driver.bundle and playwright

module playwright reads package com.microsoft.playwright.impl from both driver.bundle and driver
