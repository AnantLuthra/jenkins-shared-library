# Jenkins Shared Library

This repository contains the reusable Jenkins Shared Library used by the Java Maven app pipelines.

## What it provides

- Reusable build and Docker steps for Jenkins pipelines.
- A small wrapper around Docker operations.
- Shared pipeline logic that keeps the main Jenkinsfile clean.

## Library structure

- `vars/buildJar.groovy` - shared step for packaging the Java app with Maven.
- `vars/buildImage.groovy` - shared step that builds the Docker image.
- `vars/dockerLogin.groovy` - shared step for Docker Hub login.
- `vars/dockerPush.groovy` - shared step for pushing the Docker image.
- `src/com/example/Docker.groovy` - helper class used by the shared steps.

## How it is used in Jenkins

This library is added in Jenkins under Global Pipeline Libraries and referenced from a pipeline with:

- the library name, such as `jenkins-shared-library`
- the GitHub repository URL
- the default branch or version

Once configured, pipelines can call the shared steps directly instead of keeping all logic in the Jenkinsfile.

## Expected credentials

- `docker-hub-repo` - Jenkins credential used for Docker Hub login.

## Notes

- The shared library is designed to be reused by multiple Jenkins pipelines.
- It keeps build and Docker logic in one place so pipeline changes stay consistent across jobs.
