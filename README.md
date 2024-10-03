# spring_core_practice


Spring Core: Short Notes
1. Overview:

Spring Core is the foundational module of the Spring Framework, providing dependency injection and inversion of control (IoC) features. It facilitates loose coupling in applications by managing the lifecycle and dependencies of beans.
2. Key Concepts:

Inversion of Control (IoC): The control of object creation and lifecycle is transferred from the application code to the Spring container.

Dependency Injection (DI): This is a design pattern where the dependencies (objects) are injected into a class, rather than the class creating them itself.

3. Spring Beans:

Bean: An object that is instantiated, assembled, and managed by the Spring IoC container.
Bean Configuration: Beans can be configured via XML, Java annotations, or Java configuration classes.
4. IoC Container:

ApplicationContext: Central interface to the Spring IoC container, responsible for instantiating, configuring, and managing beans.
5. Bean Scopes:

Singleton (default): One shared instance per Spring IoC container.
Prototype: A new instance is created every time the bean is requested.
Request/Session/Global-session: Specific to web applications.

6. Autowiring:

Types: @Autowired, @Qualifier, @Resource.
Automatically injects dependencies where required, minimizing manual configurations.
