import com.webhooks.Role
import com.webhooks.UserRole
import com.webhooks.admin.Admin
import com.webhooks.person.Person

class BootStrap {

    def init = { servletContext ->

        if (Role.countByAuthority("ROLE_PERSON") < 1) {
            Role personRole = new Role(authority: "ROLE_PERSON")
            personRole.save(flush: true)
        }

        if (Role.countByAuthority("ROLE_ADMIN") < 1) {
            Role personRole = new Role(authority: "ROLE_ADMIN")
            personRole.save(flush: true)
        }

        if (Admin.countByUsername("admin1@email.com") < 1) {
            Admin admin = new Admin(firstName: "Admin", lastName: "Name #1", username: "admin1@email.com", password: "admin1234", enabled: true)
            admin.save(flush: true)
            UserRole.create(admin, Role.findByAuthority("ROLE_ADMIN"), true)
        }

        if (Person.countByUsername("person1@email.com") < 1) {
            Person person = new Person(firstName: "Person", lastName: "Name #1", username: "person1@email.com", password: "person1234")
            person.save(flush: true)
            UserRole.create(person, Role.findByAuthority("ROLE_PERSON"), true)
        }

    }
    def destroy = {
    }
}
