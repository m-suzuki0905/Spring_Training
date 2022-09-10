# Spring_Training
 ### [Spring徹底入門 Spring FrameworkによるJavaアプリケーション開発 <br>株式会社NTTデータ (著) 2016/7/20](https://www.amazon.co.jp/Spring%E5%BE%B9%E5%BA%95%E5%85%A5%E9%96%80-Spring-Framework%E3%81%AB%E3%82%88%E3%82%8BJava%E3%82%A2%E3%83%97%E3%83%AA%E3%82%B1%E3%83%BC%E3%82%B7%E3%83%A7%E3%83%B3%E9%96%8B%E7%99%BA-%E6%A0%AA%E5%BC%8F%E4%BC%9A%E7%A4%BENTT%E3%83%87%E3%83%BC%E3%82%BF-ebook/dp/B01IEWNLBU/ref=sr_1_3?crid=FMMAH1LR5P9V&keywords=spring+framework&s=digital-text&sprefix=%2Cdigital-text%2C1685&sr=1-3#:~:text=Spring%E5%BE%B9%E5%BA%95%E5%85%A5%E9%96%80%20Spring%20Framework%E3%81%AB%E3%82%88%E3%82%8BJava%E3%82%A2%E3%83%97%E3%83%AA%E3%82%B1%E3%83%BC%E3%82%B7%E3%83%A7%E3%83%B3%E9%96%8B%E7%99%BA%20Kindle%E7%89%88)
 
# Requirement
 
* JDK8
* Spring Tool Suite 3.7.3
 
# Note
 自身がM1 Macを使用しているため、該当されない方はInstallationは飛ばしてください。
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

実行にschema.spqlでなくHibernateによって実行されるスキーマ作成を採用したため本書のapplication.propertiesとズレあり。

[公式サイト参考](https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.data-initialization:~:text=single%20DataSource.-,9.%20Database%20Initialization,-An%20SQL%20database)
> application.properties
```
spring.jpa.hibernate.ddl-auto=create
spring.sql.init.mode=always
spring.jpa.defer-datasource-initialization=true
```
# Table
 <img width="983" alt="image" src="https://user-images.githubusercontent.com/113026626/189475280-5f9fcc87-c31c-4a17-ad43-9225e5f3cb6e.png">

# Author
* 鈴木 将斗
* 株式会社VRST 所属
* suzuki.masato.work@gmail.com
