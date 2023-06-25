start:
	- $(MAKE) stop
	- docker-compose up -d
	- docker-compose logs -f

stop:
	- docker-compose down --remove-orphans
	- docker container prune -f