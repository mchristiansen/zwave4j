FROM ubuntu:latest

ENV DEBIAN_FRONTEND  noninteractive
RUN apt-get -y update && apt-get -y install \
        apt-transport-https \
        g++ \
        g++-multilib \
        python-all python-dev python-pip \
        libbz2-dev \
        libssl-dev \
        libudev-dev \
        libyaml-dev \
        make \
        git \
        wget \
        sudo \
        zlib1g-dev \
        libmicrohttpd-dev \
        gnutls-bin libgnutls28-dev \
        curl \
        unzip \
        openjdk-8-jdk \
        pkg-config && \
        apt-get clean

# Gradle
ENV GRADLE_VERSION 4.3.1

RUN cd /usr/lib \
 && curl -fl https://downloads.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip -o gradle-bin.zip \
 && unzip "gradle-bin.zip" \
 && ln -s "/usr/lib/gradle-${GRADLE_VERSION}/bin/gradle" /usr/bin/gradle \
 && rm "gradle-bin.zip"

# Set Appropriate Environmental Variables
ENV GRADLE_HOME /usr/lib/gradle
ENV PATH $PATH:$GRADLE_HOME/bin

VOLUME /build
WORKDIR /build

