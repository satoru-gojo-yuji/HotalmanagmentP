src
└── main
    ├── java
    │   └── com
    │       └── example
    │           └── yourproject
    │               ├── YourProjectApplication.java
    │               ├── controller
    │               │   └── AdminController.java
    │               ├── model
    │               │   ├── Admin.java
    │               │   ├── Role.java
    │               │   └── User.java
    │               ├── repository
    │               │   ├── AdminRepository.java
    │               │   ├── RoleRepository.java
    │               │   └── UserRepository.java
    │               └── service
    │                   ├── AdminService.java
    │                   ├── RoleService.java
    │                   └── UserService.java
    └── resources
        ├── application.properties
        ├── static
        └── templates


@RequestBody - 

Simply put, the @RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object.

First, let’s have a look at a Spring controller method:

@PostMapping("/request")
public ResponseEntity postController(
  @RequestBody LoginForm loginForm) {
 
    exampleService.fakeAuthenticate(loginForm);
    return ResponseEntity.ok(HttpStatus.OK);
}

@ResponseBody
The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.

Suppose we have a custom Response object:

public class ResponseTransfer {
    private String text; 
    
    // standard getters/setters


    @Controller
@RequestMapping("/post")
public class ExamplePostController {

    @Autowired
    ExampleService exampleService;

    @PostMapping("/response")
    @ResponseBody
    public ResponseTransfer postResponseController(
      @RequestBody LoginForm loginForm) {
        return new ResponseTransfer("Thanks For Posting!!!");
     }
}