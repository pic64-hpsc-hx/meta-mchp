FROM ubuntu:24.04

ARG DEBIAN_FRONTEND=noninteractive
RUN apt-get update
# https://docs.yoctoproject.org/dev/ref-manual/system-requirements.html#ubuntu-and-debian
RUN apt-get install -y build-essential chrpath cpio debianutils diffstat file gawk gcc git iputils-ping libacl1 liblz4-tool locales python3 python3-git python3-jinja2 python3-pexpect python3-pip python3-subunit socat texinfo unzip wget xz-utils zstd
RUN echo "en_US.UTF-8 UTF-8" >> /etc/locale.gen
RUN locale-gen

# Add kas
RUN apt-get install -y kas tmux

