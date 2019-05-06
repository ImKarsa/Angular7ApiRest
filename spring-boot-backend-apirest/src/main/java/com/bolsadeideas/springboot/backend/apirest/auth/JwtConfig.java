package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
 
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678"; 

    public static final String RSA_PRIVADA ="-----BEGIN RSA PRIVATE KEY-----\r\n"+
    "MIIEowIBAAKCAQEA21G/HQo/zoVGAqw7oa2jZlKTHtLo2BfL6ErquNz3YChUifQt\r\n"+
    "UPNUzYt0D1X7IxfgLEyERrkTKYoNEAQZNndFEk8xK08KcA4ikapxzDpgW4oOAh/K\r\n"+
    "hem1NX8Fx4XzKs4uJWZuU5tD/syEx0MJB+mPhs3gBMwerTt2C6JQS3Lgs422v0ax\r\n"+
    "DMR7QLXe1W+iPD3gXlrV9lTGIToxOxTGBsLXhS1nYsCjRkp4Vq4HxRuSWpfQGE9p\r\n"+
    "P2p1wajwqVBkGxAK9UFxX6Qjb/wuFB0ncVtvirnoGTM98ojkZpmetNyANhhuyEZT\r\n"+
    "zEFjjIiLbFtj1FmlIPFW/en3UQHhzieCMUh/oQIDAQABAoIBAE9fSFEUMn9lUC8L\r\n"+
    "chFTK/2OCNxw6/+4rP0Gj+gTYBuWvPGoQvY2+gvhWkFqlpbevyyJDJ4jwMGZypxv\r\n"+
    "P0is5Xx42IyZ8GcZVn1tN/33aoP2dJdkNgE80W3o6IiK+7QUJjM23Nq5KGSAU9Vh\r\n"+
    "d1U7u8vHmjliPf/nsxMGzRRhIN0Z0uV16QjVEppXek6zY6RQs6gt0istPSqF92aH\r\n"+
    "9asJ0rktzKwYsK/GFL0ewtGrfZKOxq8UJlnKkrPDfQIYLPuW/OGjxx4+UEJ3aw8m\r\n"+
    "JM+ZwBKSxh+Wl82FRVmUi5P3gk2iKJ94XWb0I+A6o1RkPCzEtN1yKFKZfVLIP06o\r\n"+
    "TG1adZkCgYEA817KtXysbO+zGVoGJP+Z5EHlUB3QkAhvme+A2mRTmaPUKGGa8muT\r\n"+
    "kahIlbmS4SjSEMqsCLaUpoQrPpQ/oD98VNbGuQJRcrrgAfMN2KnsIpRdBZ4E/rGZ\r\n"+
    "8wl9/9YJSBnVhX6gsHinULMIugEK/rgDoZhUM4JmMXmkiLUWohJbBPcCgYEA5rNv\r\n"+
    "MqUTSpJwqengPEjrey8otm1i/DmGzwcGQ7hfVa4NZB0WcSVrMKWYHFyW+CZ6i+J4\r\n"+
    "ryeph4DGixnHvwveDUfPsy711tfeWjYSkVsl/qmyxZKCKYkx6vb7JCob1bnn9mqk\r\n"+
    "kiEM0jFPQImxDitJSAyQYhkfkR94RBsI2uEBsicCgYEA4n8JByj1zBi1RVXcPBjJ\r\n"+
    "335YbVyiGzpOqyQUdqxChc3MCJz2OMFXwIquqvHfub9k6Y3F2AIcjHCbUo1kPb53\r\n"+
    "9vlATzTSGoXDLu1GqKtUAca0YCL1oRgnH+Joqm5HixvH9YqpADP5+4f0CjAoTHFz\r\n"+
    "p7P+QUYN1+PO9hAa9VFB9ncCgYAu1CdzOUzkKzuRUfcBZa/fDmCOP0ADgM3bgkqE\r\n"+
    "Po2jf7QaKUlf6D+M3WA2CZlff7gKYwsqSru/1KT4oWAJaKhHO9duQM8IMENjPmyg\r\n"+
    "cscQnXO7ZRTkx4OJdV7fJWkHBjiOrXEAdJL8q6OxrwFwpdq3NE2ui/j7ZU7tTCuM\r\n"+
    "+nV0qwKBgHhnvveps85tLMcjt4qChYNSnLwiR+0JpmvZNgMLC3cYCbRMJgumrcxl\r\n"+
    "AxSQaNJzEXX9BV+qubqDQbQanc81n2QwRvycc7qKH9vpW+Uq7+Au9CsCIRWz6mUB\r\n"+
    "P0YGv7NE6zS/fNqTWemxGySQUcQk3hkVwmmMCMdD0z2cLFODWiNF"+
    "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLICA ="-----BEGIN PUBLIC KEY-----\r\n"+
    "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA21G/HQo/zoVGAqw7oa2j\r\n"+
    "ZlKTHtLo2BfL6ErquNz3YChUifQtUPNUzYt0D1X7IxfgLEyERrkTKYoNEAQZNndF\r\n"+
    "Ek8xK08KcA4ikapxzDpgW4oOAh/Khem1NX8Fx4XzKs4uJWZuU5tD/syEx0MJB+mP\r\n"+
    "hs3gBMwerTt2C6JQS3Lgs422v0axDMR7QLXe1W+iPD3gXlrV9lTGIToxOxTGBsLX\r\n"+
    "hS1nYsCjRkp4Vq4HxRuSWpfQGE9pP2p1wajwqVBkGxAK9UFxX6Qjb/wuFB0ncVtv\r\n"+
    "irnoGTM98ojkZpmetNyANhhuyEZTzEFjjIiLbFtj1FmlIPFW/en3UQHhzieCMUh/\r\n"+
    "oQIDAQAB\r\n"+
    "-----END PUBLIC KEY-----";
}