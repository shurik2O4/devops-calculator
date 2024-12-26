plugins {
    id("java")
    id("maven-publish")
}

group = "me.shurik"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    if (System.getenv("MAVEN_URL") != null) {
        publications {
            create<MavenPublication>("jar") {
                repositories {
                    maven(System.getenv("MAVEN_URL")) {         // Maven repository URL
                        credentials {
                            username=System.getenv("MAVEN_USER")
                            password=System.getenv("MAVEN_PASSWORD")
                        }
                    }
                }
                groupId = group.toString()
                artifactId = project.name

                // Includes jar, sources and dependencies
                from(project.components["java"])
            }
        }
    } else {
        logger.warn("[!] Maven URL is not set, skipped setting up Maven publishing")
    }
}