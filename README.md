# springboot-elasticsearch-example

## Things todo list

- Download: ` git clonehttps://github.com/hendisantika/springboot-elasticsearch-example.git`
- I used Elasticsearch   ` 8.17.0 `, in other versions you can get error.
- Docker command for up your image:
  ` docker run  -p 9200:9200  -p 9300:9300  -e "discovery.type=single-node"  -e "xpack.security.enabled=false"  docker.elastic.co/elasticsearch/elasticsearch:8.17.0 `
- If you want basic auth, you can remove ` -e "xpack.security.enabled=false" ` from command.

## Endpoints

For Get All Products ```GET localhost:8080/ ``` <br/>
For Add Product ```POST localhost:8080/ ```  <br/>
Example Request Body:

```json
{
  "id": 3,
  "name": "Itadori Yuji",
  "description": "Jujustsu Kaisen",
  "price": 33.5,
  "categoryName": "ev"
}
```

For Update Product ```PUT localhost:8080/update ```  <br/>
Example Request Body:

```json
{
  "id": 3,
  "name": "Itadori Yuji",
  "description": "Jujustsu Kaisen Update",
  "price": 35.5,
  "categoryName": "ev"
}
```

For Delete Product ```DELETE localhost:8080/{id} ```  <br/>
