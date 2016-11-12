# controle-acesso
<p>Projeto de atividade acadêmica, para por em prática o funcionamento dos tipos de controle de acesso ACL e Matriz</p>

O programa deve receber como entrada um sujeito e um objeto e deve retornar se o sujeito possui acesso ou não de acordo com a seguinte lista: <br/>
<p>Sujeitos: Alice, Bob, Carol, Davi e Eva.</p>
<p>Objetos: Arquivo1 (de Bob), Arquivo2 (de Eva), Arquivo3 (de uso restrito), Arquivo4 (de uso geral), Programa1 (de Davi), Programa2 (de uso geral).</p>

Utilizando Sprig Boot (1.4.2) com o servidor Tomcat embarcado para facilitar o deploy. <br/>
Com o build gerado é possível executar na linha de comando:<br/>
java -jar controle-acesso-0.0.1-SNAPSHOT.jar
