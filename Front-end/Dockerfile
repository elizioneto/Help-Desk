FROM node:14.21.3 AS builder

WORKDIR /helpdesk
COPY package*.json ./

RUN npm install
RUN npm install -g @angular/cli@12.0.5

COPY . .

EXPOSE 4200

CMD ["ng", "serve", "--host", "0.0.0.0"]
