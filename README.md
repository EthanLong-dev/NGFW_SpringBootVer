
# NGFW

This is a Java-based project that is deployed with Docker. It includes SSL certificates and environment variable configuration. The project can be easily started and run using Docker Compose.

## Project Structure

- `backend/`: Backend source code directory
- `files/`: Static resources samples
- `frontend/`: Frontend source code directory
- `init-scripts/`: init-scripts of database (**Please do not push to GitHub, they are ignored by .gitignore**)
- `compose.yml`: Docker Compose configuration file
- `ssl/`: SSL certificates and private keys (**Please do not push to GitHub, they are ignored by .gitignore**)
- `.env`: Environment variable configuration (**Please do not push to GitHub, they are ignored by .gitignore**)
- `.gitignore`: Git ignore file to prevent sensitive data from being tracked

## Requirements

- Docker and Docker Compose
- JDK 17 or higher
- Any other dependencies will be provided in the project

## Setup and Run

1. **Clone the project to your local machine**  
   If you haven't cloned the project yet, run the following command:

   ```bash
   git clone https://github.com/your-username/your-repo.git
   cd your-repo
   ```

2. **Set up environment variables**  
   Create a `.env` file in the root directory of the project and add the following content:

   ```
   # MySQL Configuration
   MYSQL_ROOT_PASSWORD=enter-your-password-here

   # Redis Configuration
   REDIS_PASSWORD=enter-your-password-here

   # Application Configuration
   SPRING_PROFILES_ACTIVE=prod
   JAVA_OPTS=-Xmx512m -Xms256m
   ```

   > **Note:** These environment variables correspond to your database or other service configuration. Modify them as needed.

3. **Set up SSL certificates**  
   Place your SSL certificate files (e.g., `.crt` and `.key`) into the `ssl/` directory. These files should be obtained from a trusted certificate authority.

   > **Note:** Please do not push the files in the `ssl/` directory to GitHub. These files are sensitive and have been added to `.gitignore`.
   
   > **Note:** If there's no `ssl/` directory, please creaet one.

4. **Start the project with Docker Compose**  
   Use Docker Compose to start the project by running the following command:

   ```bash
   docker compose up -d
   ```

   This will build and start the containers according to the `compose.yml` configuration.

5. **Access the application**  
   Once the containers are up and running, you should be able to access your application in a browser. If you've set up HTTPS, you can visit the corresponding URL (e.g., `https://localhost`).

## Development

### Update dependencies and rebuild

If you need to modify the source code and rebuild the project, use the following command:

```bash
docker compose build
```

### Stop the project

To stop the running Docker containers, use:

```bash
docker compose down -v
```

## Notes

- Do not push the `.env` file and the contents of the `ssl/` directory to GitHub. These files are already added to `.gitignore`.
- If you need to share an example `.env` file, you can create a `.env.example` and share it with your collaborators.

## Additional Information

If you have any issues or suggestions, feel free to open an Issue or a Pull Request.
