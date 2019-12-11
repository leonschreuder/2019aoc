plugins {
    // application
    kotlin("jvm") version "1.3.21"
}

repositories {
    jcenter()
}

dependencies {
    compile(kotlin("stdlib"))
    testCompile("junit:junit:4.12")
}
