

# WebPage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**corpusId** | **String** | ID of the corpus where the document is stored |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Storage size, given in bytes |  [optional] |
|**title** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |
| READY | &quot;ready&quot; |
| ERROR | &quot;error&quot; |



