

# Crawler


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | Display name of your Crawler |  |
|**description** | **String** | Description of your Crawler |  [optional] |
|**url** | **String** | Root url of the domain the crawl. Must start with http// or https:// |  |
|**maxCrawlDepth** | **Integer** | Maximum crawl depth |  [optional] |
|**enabled** | **Boolean** | Activation state of the crawler. True, the crawler is enable and have recurrent crawl schedule. False, the crawler is disable, no crawl until is back to an enable state. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**id** | **String** | ID of the crawler. Primary key use to index this crawler |  [optional] |
|**corpusId** | **String** | ID of the corpus where the crawler is attached |  [optional] |
|**nextCrawl** | **OffsetDateTime** |  |  [optional] |
|**lastCrawl** | **OffsetDateTime** |  |  [optional] |
|**nbDoc** | **Integer** | Number of document crawler by the crawler. Merged into your quota |  [optional] |
|**size** | **Long** | Storage size use by the crawler.  Merged into your quota |  [optional] |



