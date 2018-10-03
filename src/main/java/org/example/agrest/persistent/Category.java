package org.example.agrest.persistent;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import java.util.List;

public class Category extends CayenneDataObject {

//    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<Book>> BOOKS = Property.create("books", List.class);

//    public void setDescription(String description) {
//        writeProperty("description", description);
//    }
//    public String getDescription() {
//        return (String)readProperty("description");
//    }
//
//    public void setName(String name) {
//        writeProperty("name", name);
//    }
//    public String getName() {
//        return (String)readProperty("name");
//    }
//
//    public void addToBooks(Book obj) {
//        addToManyTarget("books", obj, true);
//    }
//    public void removeFromBooks(Book obj) {
//        removeToManyTarget("books", obj, true);
//    }
//    @SuppressWarnings("unchecked")
//    public List<Book> getBooks() {
//        return (List<Book>)readProperty("books");
//    }


}
