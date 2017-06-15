project {
  modelVersion '4.0.0'
  groupId 'com.blackducksoftware.test'
  artifactId 'example-maven-travis'
  version '0.1.0-SNAPSHOT'
  name 'Black Duck CoPilot Example for Maven/Travis CI'
  description 'Provide an example of configuring a Maven project to use the Black Duck CoPilot application'
  url 'https://github.com/BlackDuckCoPilot/example-maven-travis'
  inceptionYear '2017'
  scm {
    connection 'scm:git:git://github.com/blackducksoftware/hub-common.git/'
    developerConnection 'scm:git:git@github.com:BlackDuckCoPilot/example-maven-travis.git'
    url 'https://github.com/BlackDuckCoPilot/example-maven-travis'
  }
  properties {
    'maven.compiler.source' '1.8'
    'maven.compiler.target' '1.8'
  }
  dependencies {
    dependency {
      groupId 'com.google.code.findbugs'
      artifactId 'jsr305'
      version '3.0.1'
    }
    dependency {
      groupId 'args4j'
      artifactId 'args4j'
      version '2.33'
    }
    dependency {
      groupId 'javax.inject'
      artifactId 'javax.inject'
      version '1'
    }
    dependency {
      groupId 'org.springframework'
      artifactId 'spring-context'
      version '4.2.5.RELEASE'
    }
    dependency {
      groupId 'commons-logging'
      artifactId 'commons-logging'
      version '1.0.2'
    }
    dependency {
      groupId 'commons-io'
      artifactId 'commons-io'
      version '2.0'
    }
    dependency {
      groupId 'org.apache.httpcomponents'
      artifactId 'httpclient'
      version '4.3.5'
    }
    dependency {
      groupId 'commons-net'
      artifactId 'commons-net'
      version '3.3'
    }
    dependency {
      groupId 'commons-codec'
      artifactId 'commons-codec'
      version '1.6'
    }
    dependency {
      groupId 'org.apache.poi'
      artifactId 'poi'
      version '3.6'
    }
    dependency {
      groupId 'commons-beanutils'
      artifactId 'commons-beanutils'
      version '1.9.0'
    }
    dependency {
      groupId 'commons-collections'
      artifactId 'commons-collections'
      version '1.0'
    }
    dependency {
      groupId 'commons-fileupload'
      artifactId 'commons-fileupload'
      version '1.2.1'
    }
  }
}
