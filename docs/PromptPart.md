

# PromptPart


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**start** | **Integer** | define the beginning of the substring in the answer which is attached to a document. Document is defined by the attachmentIndex |  [optional] |
|**end** | **Integer** | define the end of the substring in the answer which is attached to a document.Document is defined by the attachmentIndex |  [optional] |
|**index** | **Integer** | Index of the attachment related to this substring |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | Kind of attachment. For web, you&#39;ll found the attachment in web[index]. For document, you&#39;ll found the attachment in document[index] |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| DOC | &quot;doc&quot; |
| WEB | &quot;web&quot; |



