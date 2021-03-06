package net.asovel.myebike.backendless.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.persistence.BackendlessDataQuery;

public class Marca
{
    private java.util.Date updated;
    private String pais;
    private String ownerId;
    private String objectId;
    private Boolean peninsula;
    private Boolean experto;
    private String pagina_web;
    private Integer nota_interna;
    private String nombre;
    private String logo;
    private java.util.Date created;
    private java.util.List<Tienda> tiendas;

    public java.util.Date getUpdated()
    {
        return updated;
    }

    public String getPais()
    {
        return pais;
    }

    public void setPais(String pais)
    {
        this.pais = pais;
    }

    public String getOwnerId()
    {
        return ownerId;
    }

    public String getObjectId()
    {
        return objectId;
    }

    public Boolean getPeninsula()
    {
        return peninsula;
    }

    public Boolean getExperto()
    {
        return experto;
    }

    public void setPeninsula(Boolean peninsula)
    {
        this.peninsula = peninsula;
    }

    public String getPagina_web()
    {
        return pagina_web;
    }

    public void setPagina_web(String pagina_web)
    {
        this.pagina_web = pagina_web;
    }

    public Integer getNota_interna()
    {
        return nota_interna;
    }

    public void setNota_interna(Integer nota_interna)
    {
        this.nota_interna = nota_interna;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getLogo()
    {
        return logo;
    }

    public void setLogo(String logo)
    {
        this.logo = logo;
    }

    public java.util.Date getCreated()
    {
        return created;
    }

    public java.util.List<Tienda> getTiendas()
    {
        return tiendas;
    }

    public void setTiendas(java.util.List<Tienda> tiendas)
    {
        this.tiendas = tiendas;
    }


    public Marca save()
    {
        return Backendless.Data.of(Marca.class).save(this);
    }

    public Future<Marca> saveAsync()
    {
        if (Backendless.isAndroid()) {
            throw new UnsupportedOperationException("Using this method is restricted in Android");
        } else {
            Future<Marca> future = new Future<Marca>();
            Backendless.Data.of(Marca.class).save(this, future);

            return future;
        }
    }

    public void saveAsync(AsyncCallback<Marca> callback)
    {
        Backendless.Data.of(Marca.class).save(this, callback);
    }

    public Long remove()
    {
        return Backendless.Data.of(Marca.class).remove(this);
    }

    public Future<Long> removeAsync()
    {
        if (Backendless.isAndroid()) {
            throw new UnsupportedOperationException("Using this method is restricted in Android");
        } else {
            Future<Long> future = new Future<Long>();
            Backendless.Data.of(Marca.class).remove(this, future);

            return future;
        }
    }

    public void removeAsync(AsyncCallback<Long> callback)
    {
        Backendless.Data.of(Marca.class).remove(this, callback);
    }

    public static Marca findById(String id)
    {
        return Backendless.Data.of(Marca.class).findById(id);
    }

    public static Future<Marca> findByIdAsync(String id)
    {
        if (Backendless.isAndroid()) {
            throw new UnsupportedOperationException("Using this method is restricted in Android");
        } else {
            Future<Marca> future = new Future<Marca>();
            Backendless.Data.of(Marca.class).findById(id, future);

            return future;
        }
    }

    public static void findByIdAsync(String id, AsyncCallback<Marca> callback)
    {
        Backendless.Data.of(Marca.class).findById(id, callback);
    }

    public static Marca findFirst()
    {
        return Backendless.Data.of(Marca.class).findFirst();
    }

    public static Future<Marca> findFirstAsync()
    {
        if (Backendless.isAndroid()) {
            throw new UnsupportedOperationException("Using this method is restricted in Android");
        } else {
            Future<Marca> future = new Future<Marca>();
            Backendless.Data.of(Marca.class).findFirst(future);

            return future;
        }
    }

    public static void findFirstAsync(AsyncCallback<Marca> callback)
    {
        Backendless.Data.of(Marca.class).findFirst(callback);
    }

    public static Marca findLast()
    {
        return Backendless.Data.of(Marca.class).findLast();
    }

    public static Future<Marca> findLastAsync()
    {
        if (Backendless.isAndroid()) {
            throw new UnsupportedOperationException("Using this method is restricted in Android");
        } else {
            Future<Marca> future = new Future<Marca>();
            Backendless.Data.of(Marca.class).findLast(future);

            return future;
        }
    }

    public static void findLastAsync(AsyncCallback<Marca> callback)
    {
        Backendless.Data.of(Marca.class).findLast(callback);
    }

    public static BackendlessCollection<Marca> find(BackendlessDataQuery query)
    {
        return Backendless.Data.of(Marca.class).find(query);
    }

    public static Future<BackendlessCollection<Marca>> findAsync(BackendlessDataQuery query)
    {
        if (Backendless.isAndroid()) {
            throw new UnsupportedOperationException("Using this method is restricted in Android");
        } else {
            Future<BackendlessCollection<Marca>> future = new Future<BackendlessCollection<Marca>>();
            Backendless.Data.of(Marca.class).find(query, future);

            return future;
        }
    }

    public static void findAsync(BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Marca>> callback)
    {
        Backendless.Data.of(Marca.class).find(query, callback);
    }
}