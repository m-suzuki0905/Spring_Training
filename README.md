# Spring_Training
 ### Spring徹底入門 Spring FrameworkによるJavaアプリケーション開発 <br>株式会社NTTデータ (著) 2016/7/20
 
# Requirement
 
* JDK8
* STS 3.7.3
 
# Note
 著者自身がM1 Macを使用しているため、該当されない方はInstallationは飛ばしてください。
 <br>下記が著者開発スペックになります
* MacBook Pro M1, 2020
* macOS Monterey 12.5.1


# Installation

1. アーキテクチャを確認
```zsh
uname -m
```
2. [M1 Mac専用Javaをインストール](https://www.azul.com/downloads/?os=macos&architecture=arm-64-bit&package=jdk#download-openjdk:~:text=Reset%20Filters-,Java%2018%20(STS),-18.0.2.1%2B1)

```zsh
java -version
javac -version
```
3. [Spring Tool Suite をインストール](https://spring.io/tools)
   - [【推奨】日本語化プラグインをダウンロード](https://mergedoc.osdn.jp/)
    zipファイル解答後、「setup.app」を起動して画面に従い、「Spring Tool Suite」を選択する
 
4. Homebrew経由でPostgreSQLをインストール

```zsh
brew search postgresql
brew install postgresql <選びたいバージョンがあれば指定> 
brew services start postgresql
```

5. バージョン確認(返ってこなければPATHを確認)
```zsh
psql --version
postgres --version
```


# Usage

実行にschema.splでなくHibernateによって実行されるスキーマ作成を採用したため本書のapplication.propertyとズレあり。

[公式サイト参考](https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.data-initialization:~:text=single%20DataSource.-,9.%20Database%20Initialization,-An%20SQL%20database)
> application.property
```
spring.jpa.hibernate.ddl-auto=create
spring.sql.init.mode=always
spring.jpa.defer-datasource-initialization=true
```

 
# Author
* 鈴木 将斗
* 株式会社VRST 所属
* suzuki.masato.work@gmail.com
