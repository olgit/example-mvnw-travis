# Black Duck CoPilot Maven-Wrapper/Travis CI Example

[![Travis CI](https://travis-ci.org/BlackDuckCoPilot/example-polyglot-travis.svg?branch=master)](https://travis-ci.org/BlackDuckCoPilot/example-polyglot-travis) [![Black Duck Security Risk](https://copilot.blackducksoftware.com/github/groups/BlackDuckCoPilot/locations/example-polyglot-travis/public/results/branches/master/badge-risk.svg)](https://copilot.blackducksoftware.com/github/groups/BlackDuckCoPilot/locations/example-polyglot-travis/public/results/branches/master)

Shows a working setup for using the Black Duck CoPilot integration to analyze the risk of project dependencies

## Travis CI Setup

The `.travis.yml` file has been modified to upload the generated data to Black Duck CoPilot:

```yaml
after_success:
- ./mvnw com.blackducksoftware.integration:hub-maven-plugin:2.0.0:build-bom -Dhub.output.directory=. -Dhub.deploy.bdio=false
- bash <(curl -s https://copilot.blackducksoftware.com/bash/travis) ./*_bdio.jsonld
```

