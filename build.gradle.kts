plugins {
    `build-scan`
    kotlin("jvm") version "1.2.31"
    application
}

application {
    mainClassName = "org.example.MyLibrary"
}

buildScan {
    setLicenseAgreementUrl("https://gradle.com/terms-of-service")
    setLicenseAgree("yes")

    publishAlways()
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib", "1.2.31"))
    testImplementation("junit:junit:4.12")
}
