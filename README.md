# Base Spring Boot Application

This is a base Spring Boot application that provides a foundation for building robust and scalable web services.

- [BitBucket Projects](https://git.developteam.net/projects)

- [Gorgeous Swagger Converter](https://kaytervn.github.io/Gorgeous-Swagger-Converter-Web/)

## Notes

**MySQL Dump:**

```cmd
"C:\Program Files\MySQL\MySQL Server 8.0\bin\mysqldump" -u root -p <database-name> > D:\Downloads\dump_file.sql
```

**MySQL Change Root Password:**

```cmd
"C:\Program Files\MySQL\MySQL Server 8.0\bin\mysqladmin" -u root -p password <new-password>
```

**Inspect table relationships**

```cmd
SELECT
    TABLE_NAME,
    COLUMN_NAME,
    CONSTRAINT_NAME,
    REFERENCED_TABLE_NAME,
    REFERENCED_COLUMN_NAME
FROM 
    INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE 
    TABLE_SCHEMA = 'database_name'
    AND TABLE_NAME = 'table_name';
```

**Set UTF-8 for tables and the database**

```cmd
ALTER DATABASE db_name CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

- Convert character :
ALTER TABLE db_name.table_name CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-  Generate query  Convert character all table :
SELECT CONCAT('ALTER TABLE `', table_name, '` CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;')
FROM information_schema.tables
WHERE table_schema = 'db_name';
```

**Create a user and grant database permissions**

```cmd
CREATE USER 'user_Po54a' IDENTIFIED BY 'epmxV9H1SNsWILvyUIJlEgbmgCbNHiQ4';
CREATE USER 'user_Po54a'@'localhost' IDENTIFIED BY 'epmxV9H1SNsWILvyUIJlEgbmgCbNHiQ4';
GRANT ALL PRIVILEGES ON db_tenant.* TO 'user_Po54a';
FLUSH PRIVILEGES;
```

**Liquibase Changelog Export Data:**

```
mvn liquibase:generateChangeLog -Dliquibase.diffTypes=data
```

---

### Starting the Application

**1.** Rename server PORT, database credentials in `application-dev.properties` and **Liquibase** properties in `pom.xml`

**2.** Run **Maven** `clean` and rebuild project

**3.** Set **SDK** to Version **11** in **File** → **Project Structure** (`Ctrl` + `Alt` + `Shift` + `S`)

**4.** Ensure database is **created** before running application

> [!NOTE]
>
> **Swagger UI:** `localhost:<PORT>/swagger-ui.html`

<details>

<summary><b>RabbitMQ Setup</b></summary>

<br>

**1.** Install RabbitMQ

- In Terminal: Run `docker pull rabbitmq:3.13.6-management`
- In Docker Desktop: Run `rabbitmq` **Image**

- Set ports: `15672`:15672/tcp (**UI**), `5672`:5672/tcp (**AMQP**)

**2.** Access Management UI

- Open: http://localhost:15672/
- Login: `guest` / `guest`

**3.** Create Admin User

- Go to **Admin** tab
- Add new user with `Admin` tag

**4.** Run application and login with new admin account

</details>

---

### Cloning Source Code

**1.** Open Terminal: Run `git clone <HTTP-Git-URL>`

**2.** Refactor package in `src/main/java/<your-package>`

**3.** Update `pom.xml`: `groupId`, `artifactId`, `name`, **Liquibase** properties

**4.** Modify `application-dev.properties`: database credentials, server **PORT**

**5.** Rename database table prefix in **models** and **Liquibase** changesets

**6.** Delete classes in folders: `controller`, `mapper`, `dto`, `form`, `model/criteria`, `repository`, `validation`

**7.** Modify: `dto/ErrorCode.java`, `constant/<your-app>Constant.java`

**8.** Keep base modules: `Account`, `Group`, `Permission`, `Setting`, `File`

---

### CRUD for a new Model

**1.** Create model class in `src/main/<your-package>/model`

**2.** Run **Maven** `clean` and rebuild project

**3.** Generate **Liquibase** changelog: `Maven` → `Plugins` → `liquibase` → `liquibase:diff`

**4.** Apply new changelog in `src/main/resources/liquibase/db.changelog-master.xml`

|                                                           File Creation Order                                                            |
| :--------------------------------------------------------------------------------------------------------------------------------------: |
|                                   `Repository` → `Criteria` → `Form` → `DTO` → `Mapper` → `Controller`                                   |
|                                                                                                                                          |
|                                                       **Controller Method Order**                                                        |
| **get** (`MODEL_V`) → **list** (`MODEL_L`) → **autoComplete** → **create** (`MODEL_C`) → **update** (`MODEL_U`) → **delete** (`MODEL_D`) |

> [!NOTE]
>
> `MODEL` is a 2-3 character abbreviation of the model name (e.g., `SE_P` for `ServerProvider`).

---

### .gitignore

```
HELP.md
target/
!.mvn/wrapper/maven-wrapper.jar
!**/src/main/**/target/
!**/src/test/**/target/

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr
*.log

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/
build/
!**/src/main/**/build/
!**/src/test/**/build/

### VS Code ###
.vscode/
```
