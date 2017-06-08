package model;

import javafx.beans.property.*;

/**
 * Software type class
 *
 * Created by Oscar Reyes on 6/7/2017.
 *
 * Describes software type.
 * Keeps track of Dependencies and possible Catagories
 */
public class SoftwareType {
    private StringProperty  name;
    private StringProperty  category;
    private StringProperty  description;
    private DoubleProperty  random;
    private BooleanProperty osSpecific;
    private BooleanProperty oneClient;
    private BooleanProperty inHouse;

    private DoubleProperty  popularity;
    private DoubleProperty  retention;
    private DoubleProperty  timescale;
    private DoubleProperty  iterative;
    private StringProperty  nameGenerator;

    public SoftwareType(SoftwareTypeBuilder builder) {
        this.name        = builder.name;
        this.category    = builder.category;
        this.description = builder.description;
        this.random      = builder.random;
        this.osSpecific  = builder.osSpecific;
        this.oneClient   = builder.oneClient;
        this.inHouse     = builder.inHouse;
    }

    // Get Properties

    public StringProperty  categoryProperty()      { return category;      }
    public StringProperty  descriptionProperty()   { return description;   }
    public StringProperty  nameProperty()          { return name;          }
    public DoubleProperty  randomProperty()        { return random;        }
    public BooleanProperty osSpecificProperty()    { return osSpecific;    }
    public BooleanProperty oneClientProperty()     { return oneClient;     }
    public BooleanProperty inHouseProperty()       { return inHouse;       }
    public DoubleProperty  popularityProperty()    { return popularity;    }
    public DoubleProperty  retentionProperty()     { return retention;     }
    public DoubleProperty  timescaleProperty()     { return timescale;     }
    public DoubleProperty  iterativeProperty()     { return iterative;     }
    public StringProperty  nameGeneratorProperty() { return nameGenerator; }

    // Getters

    public String  getName()          { return name.get();          }
    public String  getCategory()      { return category.get();      }
    public String  getDescription()   { return description.get();   }
    public double  getRandom()        { return random.get();        }
    public boolean isOsSpecific()     { return osSpecific.get();    }
    public boolean isOneClient()      { return oneClient.get();     }
    public boolean isInHouse()        { return inHouse.get();       }
    public double  getPopularity()    { return popularity.get();    }
    public double  getRetention()     { return retention.get();     }
    public double  getTimescale()     { return timescale.get();     }
    public double  getIterative()     { return iterative.get();     }
    public String  getNameGenerator() { return nameGenerator.get(); }

    // Setters

    public void setName         (String name)          { this.name.set(name);                   }
    public void setCategory     (String category)      { this.category.set(category);           }
    public void setDescription  (String description)   { this.description.set(description);     }
    public void setRandom       (double random)        { this.random.set(random);               }
    public void setOsSpecific   (boolean osSpecific)   { this.osSpecific.set(osSpecific);       }
    public void setOneClient    (boolean oneClient)    { this.oneClient.set(oneClient);         }
    public void setInHouse      (boolean inHouse)      { this.inHouse.set(inHouse);             }
    public void setPopularity   (double popularity)    { this.popularity.set(popularity);       }
    public void setRetention    (double retention)     { this.retention.set(retention);         }
    public void setTimescale    (double timescale)     { this.timescale.set(timescale);         }
    public void setIterative    (double iterative)     { this.iterative.set(iterative);         }
    public void setNameGenerator(String nameGenerator) { this.nameGenerator.set(nameGenerator); }

    /**
     *
     * Builder Class for Software Type
     */

    public static class SoftwareTypeBuilder {
        private StringProperty name;
        private StringProperty category;
        private StringProperty description;
        private DoubleProperty random;
        private BooleanProperty osSpecific;
        private BooleanProperty oneClient;
        private BooleanProperty inHouse;

        public SoftwareTypeBuilder(String name) {
            this.name = new SimpleStringProperty(name);
        }

        public SoftwareTypeBuilder category(String category) {
            this.category = new SimpleStringProperty(category);
            return this;
        }

        public SoftwareTypeBuilder description(String description) {
            this.description = new SimpleStringProperty(description);
            return this;
        }

        public SoftwareTypeBuilder random(Double random) {
            this.random = new SimpleDoubleProperty(random);
            return this;
        }

        public SoftwareTypeBuilder osSpecific(Boolean osSpecific) {
            this.osSpecific = new SimpleBooleanProperty(osSpecific);
            return this;
        }

        public SoftwareTypeBuilder oneClient(Boolean oneClient) {
            this.oneClient = new SimpleBooleanProperty(oneClient);
            return this;
        }

        public SoftwareTypeBuilder inHouse(Boolean inHouse) {
            this.inHouse = new SimpleBooleanProperty(inHouse);
            return this;
        }

        public SoftwareType build() { return new SoftwareType(this); }
    }
}
