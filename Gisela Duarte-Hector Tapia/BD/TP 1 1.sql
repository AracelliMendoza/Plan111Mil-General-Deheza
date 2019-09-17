select p.nombre, g.nombre
from peliculas p
inner join generos g on g.id = p.id_generos;