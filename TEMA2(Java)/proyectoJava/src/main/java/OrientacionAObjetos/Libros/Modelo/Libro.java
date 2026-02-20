package OrientacionAObjetos.Libros.Modelo;

 class Libro {
    // Atributo
        String isbn;
        String titulo;
        String autor;
        int numerosPaginas;
        // Constructor
         Libro(String isbn, String titulo, String autor, int numPaginas) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.numerosPaginas = numPaginas;
        }
         void imprimirResumen() {
            System.out.println("El libro '" + titulo + "' tiene " + numerosPaginas + " páginas.");
        }
        @Override
        public String toString() {
            return "ISBN: " + isbn + " | Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numerosPaginas;
        }
    }
