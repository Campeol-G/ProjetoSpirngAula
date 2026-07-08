# Usa uma imagem que já possui Java 26
FROM eclipse-temurin:26-jdk

# Define a pasta de trabalho dentro do container
WORKDIR /app

# Copia todos os arquivos do projeto
COPY . .

# Dá permissão para executar o mvnw
RUN chmod +x mvnw

# Compila o projeto
RUN ./mvnw clean package -DskipTests

# Expõe a porta usada pelo Spring Boot
EXPOSE 8080

# Inicia a aplicação
CMD ["java", "-jar", "target/ProjetoEstudo-0.0.1-SNAPSHOT.jar"]
