package iterator;

import java.util.ArrayList;

public class  Usuarios implements UserIterator {
    private ArrayList<Usuario> usuarios = new ArrayList();
    private int pos = 0;
    public void make(Usuario usuario){
        usuarios.add(usuario);
    }
    @Override
    public Usuario next() {
       Usuario usuario = this.usuarios.get(pos);
       pos = pos + 1;
       return usuario;
    }

    @Override
    public void reset() {
        pos = 0;
    }

    @Override
    public boolean hasMore() {
        return pos < usuarios.size();
    }
}
