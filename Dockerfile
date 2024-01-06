FROM openjdk
WORKDIR /app
COPY ./src/ /app
RUN javac Main.java
CMD ["java","Main"]