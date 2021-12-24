# The test automation project for JOB.OZON.RU
<a target="_blank" href="https://job.ozon.ru/">OZON job</a>

## The project is done with the following technologies:
<a href="https://www.java.com/en/">
    <img src="media/icons/Java_icon.png" width="40" height="40"  alt="Java"/>
</a>
<a href="https://gradle.org/">
    <img src="media/icons/Intellij_icon.png" width="40" height="40"  alt="Gradle"/>
</a>
<a href="https://junit.org/junit5/">
    <img src="media/icons/JUnit5_icon.png" width="40" height="40"  alt="JUnit 5"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="media/icons/Intellij_icon.png" width="40" height="40"  alt="IDEA"/>
</a>
<a href="https://ru.selenide.org/">
    <img src="media/icons/Selenide_icon.svg" width="40" height="40"  alt="Selenide"/>
</a>
<a href="https://docs.qameta.io/allure/">
    <img src="media/icons/Allure_Report_icon.svg" width="40" height="40"  alt="Allure SE"/>
</a>
<a href="https://github.com/npocbet/qaguru_13">
    <img src="media/icons/Github_icon.png" width="40" height="40"  alt="Github"/>
</a>

## Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/09-npocbet_hw_13/">jenkins.autotests.cloud/job/</a>

## Infrastructure:
<a href="https://jenkins.autotests.cloud/job/09-npocbet_hw_13/">
    <img src="media/icons/Jenkins_icon.svg" width="40" height="40"  alt="Jenkins"/>
</a>
<a href="https://selenoid.autotests.cloud/#/">
    <img src="media/icons/Selenoid_icon.svg" width="40" height="40"  alt="Selenoid"/>
</a>

## Test & Release management:

<a href="https://allure.autotests.cloud/project/811/test-cases?treeId=0">
    <img src="media/icons/Allure_TestOps_icon.svg" width="40" height="40"  alt="Allure TestOps"/>
</a>

<a href="https://jira.autotests.cloud/browse/HOMEWORK-289">
    <img src="media/icons/Jira_icon.png" width="40" height="40"  alt="Jira"/>
</a>

## USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 91.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


###### For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
