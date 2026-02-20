package OrientacionAObjetos.Libros.Modelo;

 public class Libro {
    // Atributo
        String isbn;
        String titulo;
        String autor;
        int numerosPaginas;
        // Constructor
        public Libro(String isbn, String titulo, String autor, int numPaginas) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.numerosPaginas = numPaginas;
        }
         public void imprimirResumen() {
            System.out.println("El libro '" + titulo + "' tiene " + numerosPaginas + " páginas.");
        }
        @Override
        public String toString() {
            return "ISBN: " + isbn + " | Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numerosPaginas;
        }
    }
