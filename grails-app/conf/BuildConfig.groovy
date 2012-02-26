grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {

  inherits("global") {
    exclude "commons-httpclient"
  }

  log "warn"

  repositories {
    mavenCentral()
    grailsPlugins()
    grailsHome()
    grailsCentral()
  }

  dependencies {
    compile 'net.java.dev.jets3t:jets3t:0.8.1'
    compile 'javax.mail:mail:1.4.1'
    compile 'org.apache.httpcomponents:httpcore:4.2-beta1'
    compile 'org.apache.httpcomponents:httpclient:4.2-beta1'
    runtime 'org.apache.httpcomponents:httpcore:4.2-beta1'
    runtime 'org.apache.httpcomponents:httpclient:4.2-beta1'
    compile 'commons-logging:commons-logging:1.1.1'
    compile 'org.codehaus.jackson:jackson-core-asl:1.7.2'
    compile 'com.amazonaws:aws-java-sdk:1.3.3', {
      excludes 'stax-api', 'jackson-core-asl', 'commons-httpclient', 'commons-logging'
    }
  }

  plugins {

    build ':release:1.0.0.RC3'

  }
}
