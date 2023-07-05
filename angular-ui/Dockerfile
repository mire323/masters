# Stage 1: Build Angular app
FROM node:14.20.1 as node
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build

# Stage 2: Serve Angular app with Nginx
FROM nginx:alpine
COPY --from=node /app/dist /usr/share/nginx/html
COPY nginx/nginx.conf /etc/nginx/conf.d/default.conf
