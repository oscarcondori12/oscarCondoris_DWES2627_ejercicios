¿Por qué has tenido que cambiar de ubicación las vistas?
Por que el spring busca la vista que devuelve el controlador /resources/templates y si lo dejamos fuera pues la ruta no responderia


● ¿Has tenido que cambiar el código HTML del menú de navegación? ¿Por qué?

si. Porque ahora gracias a un controlador en vez de tener que poner en todas las vistas el mismo codigo redundante para poder navegar pues con un el controlador solo tenemos que poner "/ la ruta que quereamos"

● ¿Tienen que llamarse igual la ruta de un @GetMapping y la vista que devuelve? Justifícalo
con tu proyecto.

no osea por que por ejemplo cuando yo quiero ir al index pues por ejemplo solo pone el getmapping y ("/") no hace falta poner index.html ni nada de eso