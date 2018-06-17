# connection-pool-postgreSQL

## Install postgreSQL on Linux
```bash
sudo apt-get update
sudo apt-get install postgresql postgresql-contrib
```

alterar senha padrão do postgres
psql -c "ALTER USER postgres WITH PASSWORD 'nova_senha'" -d template1

psql -l lista os bancos de dados

\dt