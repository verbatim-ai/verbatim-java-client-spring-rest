

# DocumentResumable


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**corpusId** | **String** | ID of the corpus where the document is stored |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Storage size, given in bytes |  [optional] |
|**filename** | **String** | Filename of the document |  [optional] |
|**contentType** | **String** | Content type of the document |  [optional] |
|**size** | **Long** | Storage size, given in bytes |  [optional] |
|**nbPages** | **Integer** | Total number of pages in the document |  [optional] |
|**pages** | [**List&lt;DocumentPage&gt;**](DocumentPage.md) | Info abouts pages of the document (title, previews, fileId of the preview) |  [optional] |
|**uploadSessionURL** | **String** | Upload url to push chunks of your file.**[Resumable documentation from Google](https://cloud.google.com/storage/docs/performing-resumable-uploads#chunked-upload)** and **[our Cookbook](https://www.verbatim.cloud/cookbook/resumable-uploads)** explain how use this &#x60;uploadSessionURL&#x60; |  [optional] |
|**uploadSessionExpiredAt** | **OffsetDateTime** | Timestamp when URL will be expired. &#x60;uploadSessionURL&#x60; can&#39;t be used any more after the date |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |
| READY | &quot;ready&quot; |
| ERROR | &quot;error&quot; |



