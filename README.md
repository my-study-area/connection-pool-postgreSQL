# connection-pool-postgreSQL

## Install postgreSQL on Linux
```bash
sudo apt-get update
sudo apt-get install postgresql postgresql-contrib
```

alterar senha padrão do postgres
psql -c "ALTER USER postgres WITH PASSWORD 'nova_senha'" -d NomeDoBancoDeDados

psql -l lista os bancos de dados

login - `sudo psql -h localhost -U usuario -d NomeDoBancoDeDados`

\dt - lista o nome das tabelas

\d nomeDaTabelas - descreve as informações sobre a tabela como nome das colunas e tipos de dados