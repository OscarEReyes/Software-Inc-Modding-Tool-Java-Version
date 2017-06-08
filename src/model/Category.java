package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Category Object Class
 *
 * Created by Oscar Reyes on 6/8/2017.
 *
 * Represent the possible category object that can represent a sub-type of a software type.
 * Each sub-type with its own characteristics, name-generator, description, etc.
 *
 * An example used in-game is that of Computer OS, Console OS, and Phone OS.
 *
 * Horizontal aligned only because structure of this object is not very likely to change drastically any time soon.
 *
 */


public class Category {
    private StringProperty  name;
    private StringProperty  description;
    private BooleanProperty population;
    private BooleanProperty retention;
    private BooleanProperty timescale;
    private BooleanProperty iterative;
    private StringProperty  nameGenerator;

    public Category(Category.CategoryBuilder builder) {
        this.name          = builder.name;
        this.description   = builder.description;
        this.population    = builder.population;
        this.retention     = builder.retention;
        this.timescale     = builder.timescale;
        this.nameGenerator = builder.nameGenerator;
    }

    public  String  getName()          { return name.get();          }
    public  String  getDescription()   { return description.get();   }
    public  boolean isPopulation()     { return population.get();    }
    public  boolean isRetention()      { return retention.get();     }
    public  boolean isTimescale()      { return timescale.get();     }
    public  boolean isIterative()      { return iterative.get();     }
    public  String  getNameGenerator() { return nameGenerator.get(); }

    // Setters

    public void setName         (String name)          { this.name.set(name);                   }
    public void setDescription  (String description)   { this.description.set(description);     }
    public void setPopulation   (boolean population)   { this.population.set(population);       }
    public void setRetention    (boolean retention)    { this.retention.set(retention);         }
    public void setTimescale    (boolean timescale)    { this.timescale.set(timescale);         }
    public void setIterative    (boolean iterative)    { this.iterative.set(iterative);         }
    public void setNameGenerator(String nameGenerator) { this.nameGenerator.set(nameGenerator); }

    // Get Property Methods

    public StringProperty  nameProperty()          { return name;          }
    public StringProperty  descriptionProperty()   { return description;   }
    public BooleanProperty populationProperty()    { return population;    }
    public BooleanProperty retentionProperty()     { return retention;     }
    public BooleanProperty timescaleProperty()     { return timescale;     }
    public BooleanProperty iterativeProperty()     { return iterative;     }
    public StringProperty  nameGeneratorProperty() { return nameGenerator; }


    /**
     *
     * Builder Class for Software Type
     */

    class CategoryBuilder {
        private StringProperty  name;
        private StringProperty  description;
        private BooleanProperty population;
        private BooleanProperty retention;
        private BooleanProperty timescale;
        private BooleanProperty iterative;
        private StringProperty  nameGenerator;

        public CategoryBuilder(String name) {
            this.name = new SimpleStringProperty(name);
        }

        public CategoryBuilder description(String description) {
            this.description = new SimpleStringProperty(description);
            return this;
        }

        public CategoryBuilder population(Boolean population) {
            this.population = new SimpleBooleanProperty(population);
            return this;
        }

        public CategoryBuilder retention(Boolean retention) {
            this.retention = new SimpleBooleanProperty(retention);
            return this;
        }

        public CategoryBuilder timescale(Boolean timescale) {
            this.timescale = new SimpleBooleanProperty(timescale);
            return this;
        }

        public CategoryBuilder iterative(Boolean iterative) {
            this.iterative = new SimpleBooleanProperty(iterative);
            return this;
        }

        public CategoryBuilder nameGenerator(String nameGenerator) {
            this.nameGenerator = new SimpleStringProperty(nameGenerator);
            return this;
        }

        public Category build() { return new Category(this); }
    }


}
