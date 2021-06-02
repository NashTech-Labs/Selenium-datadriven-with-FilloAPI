# Selenium-datadriven-with-FilloAPI
Fillo  is a Java API that is used for fetching data from Excel Files. It's an open source API(created by Codoid) and it's also help to Reading the Excel data using Fillo API in selenium. This API can be used to trigger select, insert, and update operations with where conditions. It also supports multiple where conditions.This makes data retrieval and data manipulation much easy when dealing with data-driven automated scripts.

## Fillo Maven Dependency
    <dependency>
        <groupId>com.codoid.products</groupId>
        <artifactId>fillo</artifactId>
        <version>1.15</version>
    </dependency>
    
## Execution Steps To Be Followed For Reading Excel sheet
* Create an Object of Fillo Class.
* Create an Object for Connection class to establish the connection between the excel sheet and Fillo API’s.
* Write the Query.
* Execute the Select query and store the result in a Recordset class present in the Fillo API.
* Use the Count method for returning all data from excel.
* Create a loop for fetching all data from Excelsheet.
* Close the recordset & connection to avoid a memory leak.

## Fillo API supports below queries
* SELECT
* CREATE
* INSERT
* SELECT WITH WHERE CONDITION
* UPDATE

## Advantage of using Fillo API
* Erase the excel values through script instead of manually.
* Add the data in particular row and column in excel sheet through script.
* Update any particular row and column data through Fillo API.

## Execution Steps for Run this script
* Clone this repository in your system.
* Add Fillo API maven dependency for your suitable system/code.
* Run the script for each operations.
